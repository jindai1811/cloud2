package com.serket.cloud.server;

import com.serket.cloud.bean.Drugstore;
import com.serket.cloud.service.BaseService;
import com.serket.cloud.service.DrugstoreService;
import com.sun.xml.internal.ws.resources.HttpserverMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RestController
public class UserServerImpl extends GlobeExceptionHandler implements UserServer {

    @Autowired
    private DrugstoreService service;

    public Map<String, String> businessLogin(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("appid") String appid, HttpServletRequest request) {
        String ip = request.getRemoteAddr();

        Drugstore drugstore = new Drugstore();
        drugstore.setAppid(appid);
        drugstore.setName(name);
        drugstore.setPassword(password);
        Map<String, String> msg = new HashMap<String, String>();
        String accesstoken = service.login(drugstore, ip);
        if (accesstoken == null) {
            msg.put("state", "fail");
            msg.put("errmsg", "loging  fail");
            return msg;
        }
        msg.put("state", "ok");
        msg.put("accesstoken", accesstoken);
        return msg;
    }

    public Map<String, String> serverLogin(@RequestParam("name") String name, @RequestParam("password") String password) {
        return null;
    }
}
