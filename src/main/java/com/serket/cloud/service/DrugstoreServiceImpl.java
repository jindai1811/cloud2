package com.serket.cloud.service;

import com.serket.cloud.bean.Drugstore;
import com.serket.cloud.util.Encryption;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;



/**
 * Created by WangYa on 2015/5/11.
 */
@Service
public class DrugstoreServiceImpl extends BaseService implements  DrugstoreService {
    public void addDrugstore(Drugstore drugstore){
        mongoTemplate.insert(drugstore);
    }

    public String login(String name, String password) {
        Criteria criteria = new Criteria();
        criteria.andOperator(Criteria.where("password").is(password), Criteria.where("name").is(name));
        Drugstore drugstore= mongoTemplate.findOne(new Query().addCriteria(criteria), Drugstore.class);
        if(drugstore==null) {
            return null;
        }
        String accessToken= Encryption.accessToken();

        return null;
    }
}
