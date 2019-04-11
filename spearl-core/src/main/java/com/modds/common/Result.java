package com.modds.common;

public class Result {

    private int code;
    private String msg;
    private Object body;


    public static Result success(String msg, Object body) {
        Result result = new Result();
        result.msg = msg;
        result.body = body;
        result.code = 0;
        return result;
    }

    public static Result success() {
        return success("success", null);
    }

    public static Result success(Object body){
        return success(null, body);
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getBody() {
        return body;
    }

    public static Result failed(int code, String msg, Object body) {
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        result.body = body;

        return result;
    }

    public static Result failed(String msg, Object body) {
        return failed(1, msg, body);
    }

    public static Result failed(String msg) {
        return failed(msg, null);
    }

    public static Result failed() {
        return failed("failed!");
    }

}
