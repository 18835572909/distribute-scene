package com.rhb.api.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * @author: rhb
 * @date: ${date} ${time}
 * @description:
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class APIResponse {
    private int code;
    private String msg;
    private Object data;

    public static APIResponse instance(int code,String msg){
        APIResponse apiResponse = new APIResponse();
        apiResponse.setCode(code);
        apiResponse.setMsg(msg);
        return apiResponse;
    }

    public static APIResponse instance(Object data){
        APIResponse apiResponse = new APIResponse();
        apiResponse.setCode(0);
        apiResponse.setMsg("操作成功");
        apiResponse.setData(data);
        return apiResponse;
    }
}
