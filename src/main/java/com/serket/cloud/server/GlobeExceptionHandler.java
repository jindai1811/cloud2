package com.serket.cloud.server;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */

public class GlobeExceptionHandler {

    @ExceptionHandler({Exception.class})
    public Map<String, String> s(Exception e){
        Map<String,String> msg=new HashMap<String, String>();
        msg.put("state","fail");
        if(e instanceof MissingServletRequestParameterException){
            msg.put("errmsg","  parameters Exception");
        }
        msg.put("e",e.toString()+"   "+e.getClass());
        return msg;
    }

}
