package life.majiang.community.enums;

public enum CommentTypeEnum {

    QUESTION(1),
    COMMENT(2);

    private Integer type;

    public Integer getType(){
        return this.type;
    }
    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
