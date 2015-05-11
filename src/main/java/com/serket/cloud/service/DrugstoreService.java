package com.serket.cloud.service;

import com.serket.cloud.bean.Drugstore;

/**
 * Created by WangYa on 2015/5/11.
 */
public interface DrugstoreService {
    /**
     * 添加一个商户
     *
     * @param drugstore 商户信息
     */
    public void addDrugstore(Drugstore drugstore);

    /**
     * 登录
     * @param name 用户名
     * @param password 密码
     * @return accessToken
     *
     */
    public String login(String name,String password);

}
