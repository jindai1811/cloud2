package com.serket.cloud.service;

/**
 * Created by Administrator on 2015/5/10.
 */
public interface PrescriptionService {
    /**
     * ���� ���ݲ������ɶ�ά��
     * @param appid �̼�id
     * @param content ҽ������
     * @return ��ά��code
     */
    String generateQRCode(String appid, String content);
}
