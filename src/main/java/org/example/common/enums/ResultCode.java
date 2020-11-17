package org.example.common.enums;

import org.example.common.constant.MsgKeyConstant;
import org.example.common.util.MessageUtil;

public enum ResultCode {
    SUCCESS(0, MsgKeyConstant.SUCCESS),
    FAILURE(9999, MsgKeyConstant.FAIL),
    ;

    ResultCode(Integer code, String msgKey) {
        this.code = code;
        this.msgKey = msgKey;
    }

    private final Integer code;
    private final String msgKey;

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return MessageUtil.message(msgKey);
    }
}