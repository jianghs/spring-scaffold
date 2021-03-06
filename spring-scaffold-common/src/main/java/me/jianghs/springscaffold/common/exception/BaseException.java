package me.jianghs.springscaffold.common.exception;

import lombok.Data;
import lombok.Getter;
import me.jianghs.springscaffold.common.enums.ResultCode;

/**
 * @className: BaseException
 * @description: TODO
 * @author: jianghs430
 * @createDate: 2020/8/18 9:30
 * @version: 1.0
 */
@Getter
public class BaseException extends RuntimeException {
    private int code;
    private String msg;

    public BaseException() {
        this(ResultCode.FAILED, ResultCode.FAILED.getMsg());
    }

    public BaseException(String msg) {
        this(ResultCode.FAILED, msg);
    }

    public BaseException(ResultCode resultCode, String msg) {
        super(msg);
        this.code = resultCode.getCode();
        this.msg = msg;
    }
}
