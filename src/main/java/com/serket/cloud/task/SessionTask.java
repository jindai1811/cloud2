package com.serket.cloud.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by WangYa on 2015/5/14.
 */
@Service
public class SessionTask {
    @Scheduled(cron = "0/5 * * * * ?   ")
    public void  clearSession(){
        System.out.println(new Date());
    }
}
