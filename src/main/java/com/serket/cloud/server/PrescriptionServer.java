package com.serket.cloud.server;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RequestMapping("/")
public interface PrescriptionServer {

    /**
     * 商家请求数据
     *
     * @param appid   授权id
     * @param content 内容
     * @return Json
     */
    @RequestMapping(value = "/business/prescription/{appid}/{content}", method = RequestMethod.GET)
    public Map<String, String> businessPrescription(@PathVariable("appid") String appid, @PathVariable("content") String content);


    /**
     * 服务器 请求
     *
     * @param qrcode
     * @return 内容
     */
    @RequestMapping(value = "/server/content", method = RequestMethod.GET)
    public Map<String, String> servicePrescription(@RequestParam("qrcode") String qrcode);

}
