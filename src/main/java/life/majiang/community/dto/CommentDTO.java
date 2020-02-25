package life.majiang.community.dto;

import lombok.Data;

/**
 * @ClassName CommentDTO
 * @Description TODO
 * @Author admin
 * @Date 2020-01-13 10:53
 * @Version 1.0
 */
@Data
public class CommentDTO {

    private Long parentId;
    private String content;
    private Integer type;

}
