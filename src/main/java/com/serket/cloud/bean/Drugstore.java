package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by WangYa on 2015/5/11.
 */
public class Drugstore {
    private String id;//	Stirng	��	ʹ��uuid��Ϊ����
    private String name;//	Stirng	��	�û���
    private String password;//	Stirng	��	����
    private String appid;//	Stirng	��	�̻�
    private String remarks;    //String	��	��ע
    private Timestamp registerDate;    //Date	��	ע��ʱ��
    private int state;//	״̬	��	Ĭ��0����,-1ɾ��,1 ����

    @Override
    public String toString() {
        return "Drugstore{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", appid='" + appid + '\'' +
                ", remarks='" + remarks + '\'' +
                ", registerDate=" + registerDate +
                ", state=" + state +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
