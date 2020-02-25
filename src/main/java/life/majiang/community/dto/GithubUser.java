package life.majiang.community.dto;

import lombok.Data;

/**
 * @ClassName GithubUser
 * @Description TODO
 * @Author admin
 * @Date 2019-12-27 16:23
 * @Version 1.0
 */
@Data
public class GithubUser {
    private Long id;
    private String name;
    private String bio;
    private String login;
    private String avatar_Url;
}
