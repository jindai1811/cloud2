package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/5/10.
 */
public class Log {
    private String id;//Stirng	��	ʹ��uuid��Ϊ����
    private String ip;//Stirng	��	�����ߵ�ip
    private Timestamp accessDate;//Date	��	����ʱ��
    private String appid;//	Stirng	��	�̻�id
    private String serverid;//	Stirng	��	������id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Timestamp getAccessDate() {
        return accessDate;
    }

    public void setAccessDate(Timestamp accessDate) {
        this.accessDate = accessDate;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getServerid() {
        return serverid;
    }

    public void setServerid(String serverid) {
        this.serverid = serverid;
    }
}
