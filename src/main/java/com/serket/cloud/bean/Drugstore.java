package com.serket.cloud.bean;

import java.sql.Timestamp;

/**
 * Created by WangYa on 2015/5/11.
 */
public class Drugstore {
    private String id;//	Stirng	否	使用uuid作为主键
    private String name;//	Stirng	否	用户名
    private String password;//	Stirng	否	密码
    private String appid;//	Stirng	否	商户
    private String remarks;    //String	是	备注
    private Timestamp registerDate;    //Date	否	注册时间
    private int state;//	状态	否	默认0正常,-1删除,1 禁用

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
