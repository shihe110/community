package life.majiang.community.exception;

/**
 * @ClassName CustomizeException
 * @Description TODO
 * @Author admin
 * @Date 2020-01-06 14:57
 * @Version 1.0
 */
public class CustomizeException extends RuntimeException {
    private String messge;
    private Integer code;

    public CustomizeException(CustomizeErrorCode errorCode) {
        this.messge = errorCode.getMessage();
        this.code = errorCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return messge;
    }
}
