package com.serket.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Created by Administrator on 2015/5/10.
 */
public class BaseService {
    @Autowired
    MongoTemplate mongoTemplate;
}
