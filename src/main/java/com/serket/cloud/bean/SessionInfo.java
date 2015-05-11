package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by WangYa on 2015/5/11.
 */
public class SessionInfo {
    private String appid;//	Stirng	否	商户id
    private String accessToken;//	Stirng	否	令牌
    private String verification;//	Stirng	否	校验码 (ip+accessToken)+算法
    private Timestamp lastDate;// 最后一次访问时间
    private String ip;
    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getVerification() {
        return verification;

    }

    public void setVerification(String verification) {
        this.verification = verification;
    }

    public Timestamp getLastDate() {
        return lastDate;
    }

    public void setLastDate(Timestamp lastDate) {
        this.lastDate = lastDate;
    }
}
