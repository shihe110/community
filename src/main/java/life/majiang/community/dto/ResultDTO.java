package life.majiang.community.dto;

import lombok.Data;

/**
 * @ClassName ResultDTO
 * @Description TODO
 * @Author admin
 * @Date 2020-01-13 13:23
 * @Version 1.0
 */
@Data
public class ResultDTO {
    private String message;
    private Integer code;

    public static ResultDTO errorOf(Integer code, String message){
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }
}
