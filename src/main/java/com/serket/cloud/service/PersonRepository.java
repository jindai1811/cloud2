package com.serket.cloud.service;

import com.serket.cloud.bean.Persion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2015/5/10.
 */
@Service
public class PersonRepository implements  AbstractRepository {
    @Autowired
    private MongoTemplate mongoTemplate;


    public List<Persion> findAll() {
        return getMongoTemplate().find(new Query(), Persion.class);
    }







    public void insert(Persion person) {
        getMongoTemplate().insert(person);
    }

    public MongoTemplate getMongoTemplate() {
        return mongoTemplate;
    }

    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }
}
