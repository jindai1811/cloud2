package com.serket.cloud.service;

/**
 * Created by Administrator on 2015/5/10.
 */
public interface PrescriptionService {
    /**
     * 保存 内容并且生成二维码
     * @param appid 商家id
     * @param content 医嘱内容
     * @return 二维码code
     */
    String generateQRCode(String appid, String content);

    /**
     * 根据二维码获取内容
     * @param qrCode
     * @return 内容
     */
    String getContent(String qrCode);
}
