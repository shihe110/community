package life.majiang.community.provider;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import life.majiang.community.dto.AccessTokenDTO;
import life.majiang.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.alibaba.fastjson.JSON;
import java.io.IOException;

/**
 * author:zjf 2019-12-26
 */
@Component
public class GithubProvider {

    @Value("${github.redirect.uri}")
    private String redirectUri;
    /**
     * 获取github:access_token
     * 参见github:access_token接口说明
     * POST https://github.com/login/oauth/access_token
     * @param accessTokenDTO
     * @return
     * @throws IOException
     */
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();

        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String re = response.body().string();
            System.out.println(re);
            String token = re.split("&")[0].split("=")[1];
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 使用access_token通过github User接口获取用户信息
     * 接口：GET https://api.github.com/user
     * @param accessToken
     */
    public GithubUser getUser(String accessToken){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token="+accessToken)
                .build();
        try (Response response = client.newCall(request).execute()) {
            String githubUserJson = response.body().string();
            GithubUser githubUser = JSON.parseObject(githubUserJson, GithubUser.class);
            return githubUser;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
