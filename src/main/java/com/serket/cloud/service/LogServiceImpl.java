package com.serket.cloud.service;

import com.serket.cloud.bean.Log;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/5/10.
 */
@Service
public class LogServiceImpl extends BaseService implements LogService {
    public void log(Log log) {

        mongoTemplate.insert(log);
    }
}
