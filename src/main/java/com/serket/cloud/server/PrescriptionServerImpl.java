package com.serket.cloud.server;

import com.serket.cloud.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/5/10.
 */
@RestController
public class PrescriptionServerImpl implements PrescriptionServer {
    @Autowired
    private PrescriptionService service;

    public Map<String, String> businessPrescription(@PathVariable("appid") String appid, @PathVariable("content") String content) {
        String QRCode = service.generateQRCode(appid, content);
        Map<String, String> map = new HashMap<String, String>();
        // ×´Ì¬
        map.put("state", "ok");
        // ¶þÎ¬ÂëÄÚÈÝ
        map.put("QRCode", service.generateQRCode(appid, content));
        return map;
    }

    public Map<String, String> servicePrescription( @RequestParam("qrcode") String qrcode) {
        System.out.println("qrcode"+qrcode);
        String content = service.getContent(qrcode);
        Map<String, String> map = new HashMap<String, String>();
        if (content == null) {
            map.put("state", "fail");
            map.put("errmsg", "non-existent");
            return map;
        }
        map.put("state", "ok");
        map.put("content", content);
        return map;
    }


}
