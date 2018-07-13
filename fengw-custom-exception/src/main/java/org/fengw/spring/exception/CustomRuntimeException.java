package org.fengw.spring.exception;

/**
 * 自定义异常的事务回滚
 *
 * @author Feng Wei
 */
public class CustomRuntimeException extends RuntimeException {

    /** Serial Version UID */
    private static final long serialVersionUID = 1L;

    /** 错误信息 */
    private String message;

    /**
     * 构造方法
     * @param message 错误信息
     */
    public CustomRuntimeException(String message) {
        super(message);
        this.message = message;
    }

    /**
     * 构造方法
     * @param message 错误信息
     * @param e 异常
     */
    public CustomRuntimeException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message 要设置的 message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
