package com.serket.cloud.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RequestMapping("/")
public interface UserServer {
    /**
     * 药店认证登录
     * @param name 用户名
     * @param password 密码
     * @param appid 发的id
     * @return json 返回状态
     */
    @RequestMapping(value = "/business/login", method = RequestMethod.GET)
    public Map<String, String> businessLogin(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("appid") String appid,HttpServletRequest request);

    /**
     * 推送服务器认证登录
     * @param name 用户名
     * @param password 密码
     * @return json 返回数据
     */
    @RequestMapping(value = "/server/login", method = RequestMethod.GET)
    public Map<String, String>serverLogin(@RequestParam("name") String name, @RequestParam("password") String password);


}
