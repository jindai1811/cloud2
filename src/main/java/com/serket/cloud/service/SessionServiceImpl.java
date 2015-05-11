package com.serket.cloud.service;

import com.serket.cloud.bean.SessionInfo;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

/**
 * Created by WangYa on 2015/5/11.
 */
@Service
public class SessionServiceImpl extends BaseService implements SessionService {
    public SessionInfo getSessionInfo(String accessToken) {
        Criteria criteria = new Criteria();
        criteria.where("accessToken").is(accessToken);
        return mongoTemplate.findOne(new Query(criteria), SessionInfo.class);

    }
}
