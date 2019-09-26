package com.jj.spb.spring_boot_mybatis.factory;

import com.alibaba.fastjson.JSON;
import com.jj.spb.spring_boot_mybatis.resultEntity.Result;

public class ResultFactory {

    public static String buildResultBody(boolean isSuccess,Object content,int errorCode,String message){
        Result result = new Result();
        result.setSuccess(isSuccess);
        result.setContent(content == null ? null : JSON.toJSONString(content));
        result.setErrorCord(errorCode);
        result.setErrorMessage(message);
        return JSON.toJSONString(result);
    }
}
