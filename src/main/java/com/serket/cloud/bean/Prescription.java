package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by Administrator on 2015/5/10.
 */
public class Prescription {
    private String id;//	Stirng	��	ʹ��uuid��Ϊ����
    private String content;//	Stirng	��	ҽ������
    private Timestamp createdate;//	Date	��	����ʱ��
    private String appid;//Stirng	��	�̻�id
    private String qrcode;//	Stirng
    private int state;//Int		��	�̻�id��	Ĭ��0����,-1ɾ��,1 ʧЧ


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
