package com.hjp.usercenter.common;

public enum ErrorCode {
    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "請求参数错误", ""),
    NULL_ERROR(40001, "請求數據为空", ""),
    NOT_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000,"系統內部錯誤","");

    private final int code;
    /**
     * 狀態碼信息
     */
    private final String message;
    /**
     * 詳細信息(狀態碼詳細信息描述)
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
