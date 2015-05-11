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
     * ҩ����֤��¼
     * @param name �û���
     * @param password ����
     * @param appid ����id
     * @return json ����״̬
     */
    @RequestMapping(value = "/business/login", method = RequestMethod.GET)
    public Map<String, String> businessLogin(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("appid") String appid,HttpServletRequest request);

    /**
     * ���ͷ�������֤��¼
     * @param name �û���
     * @param password ����
     * @return json ��������
     */
    @RequestMapping(value = "/server/login", method = RequestMethod.GET)
    public Map<String, String>serverLogin(@RequestParam("name") String name, @RequestParam("password") String password);


}
