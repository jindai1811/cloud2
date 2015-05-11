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
        // 使用用户名跟密码去数据库查询
        Drugstore dbdrugstore = mongoTemplate.findOne(new Query().addCriteria(criteria), Drugstore.class);
        //如果数据库中没有
        if (dbdrugstore == null) {
            return null;
        }
        // 提交的appid 跟查询到的不一致
        if (!drugstore.getAppid().equals(dbdrugstore.getAppid())) {
            return null;
        }
        String accessToken = Encryption.accessToken();
        SessionInfo info=new SessionInfo();
        info.setAppid(drugstore.getAppid());
        info.setIp(ip);
        info.setAccessToken(accessToken);
        //校验码
        info.setVerification(Encryption.SHA(accessToken+ip));
        mongoTemplate.insert(info);
        return accessToken;
    }
}
