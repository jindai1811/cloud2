package com.serket.cloud.service;

import com.serket.cloud.bean.Prescription;
import com.serket.cloud.bean.SessionInfo;
import com.serket.cloud.util.Encryption;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.sql.Timestamp;
import java.util.UUID;

/**
 * Created by Administrator on 2015/5/10.
 */
@Service
public class PrescriptionServiceImpl extends BaseService implements PrescriptionService {
    public String generateQRCode(String appid, String content) {
        Prescription prescription = new Prescription();
        // �����̼ҵ�id
        prescription.setAppid(appid);
        //����ҽ������
        prescription.setContent(content);
        // �������ʱ��
        prescription.setCreatedate(new Timestamp(System.currentTimeMillis()));
        // ���ɶ�ά������
        String QRCode = Encryption.QRCode();
        prescription.setQrcode(QRCode);
        mongoTemplate.insert(prescription);

        //���ص�ַ+��ά��
        return Encryption.getdownload()+ QRCode;
     }

    public String getContent(String qrCode) {
        Criteria criteria = new Criteria();
        System.out.println("qrCode"+"="+qrCode);
        criteria.where("qrcode").is(qrCode);
        try {
            return mongoTemplate.findOne(new Query(criteria), Prescription.class).getContent();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }

}
