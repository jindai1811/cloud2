package com.serket.cloud.service;

import com.serket.cloud.bean.Drugstore;
import com.serket.cloud.bean.SessionInfo;
import com.serket.cloud.util.Encryption;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;


/**
 * Created by WangYa on 2015/5/11.
 */
@Service
public class DrugstoreServiceImpl extends BaseService implements DrugstoreService {
    public void addDrugstore(Drugstore drugstore) {
        mongoTemplate.insert(drugstore);
    }

    public String login(Drugstore drugstore, String ip) {
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("password").is(drugstore.getPassword()), Criteria.where("name").is(drugstore.getName()));
        // ʹ���û���������ȥ���ݿ��ѯ
        Drugstore dbdrugstore = mongoTemplate.findOne(new Query().addCriteria(criteria), Drugstore.class);
        //������ݿ���û��
        if (dbdrugstore == null) {
            return null;
        }
        // �ύ��appid ����ѯ���Ĳ�һ��
        if (!drugstore.getAppid().equals(dbdrugstore.getAppid())) {
            return null;
        }
        String accessToken = Encryption.accessToken();
        SessionInfo info=new SessionInfo();
        info.setAppid(drugstore.getAppid());
        info.setIp(ip);
        info.setAccessToken(accessToken);
        //У����
        info.setVerification(Encryption.SHA(accessToken+ip));
        mongoTemplate.insert(info);
        return accessToken;
    }
}
