package com.serket.cloud.server;

import com.serket.cloud.service.BaseService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RestController
public class UserServerImpl extends GlobeExceptionHandler implements  UserServer {
    public Map<String, String> businessLogin(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("appid") String appid) {



        Map<String,String>  msg= new HashMap<String, String>();
        msg.put("state","ok");
        msg.put("accesstoken","sFopJ9lMmLl4u-ad61ojKpS0TolhN2s3SnHoI2Mh5GgdiYb35i-7DG2T2CDyQKMe");
        return msg;
    }

    public Map<String, String> serverLogin(@RequestParam("name") String name, @RequestParam("password") String password) {
        return null;
    }
}
