package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by WangYa on 2015/5/11.
 */
public class SessionInfo {
    private String appid;//	Stirng	��	�̻�id
    private String accessToken;//	Stirng	��	����
    private String verification;//	Stirng	��	У���� (ip+accessToken)+�㷨
    private Timestamp lastDate;// ���һ�η���ʱ��
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
