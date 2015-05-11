package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/5/10.
 */
public class Prescription {
    private String id;//	Stirng	否	使用uuid作为主键
    private String content;//	Stirng	否	医嘱内容
    private Timestamp createdate;//	Date	否	创建时间
    private String appid;//Stirng	否	商户id
    private String qrcode;//	Stirng
    private int state;//Int		否	商户id否	默认0正常,-1删除,1 失效


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
