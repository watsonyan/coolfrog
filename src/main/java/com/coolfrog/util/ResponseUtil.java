package com.coolfrog.util;

public class ResponseUtil {
    public static Result ok() {
        return new Result(ResultCode.OK);
    }

    public static Result fail() {
        return new Result(ResultCode.FAIL);
    }

    public static Result ok(Object data) {
        return new Result(ResultCode.OK, data);
    }

    public static Result fail(String msg) {
        return new Result(ResultCode.FAIL, msg);
    }
}
