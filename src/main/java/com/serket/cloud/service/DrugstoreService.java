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
     * 商户登录
     * @param drugstore 用户登录信息
      * @param ip 登录的ip
     * @return 成功返回accessToken,失败返回null
     */
    public String login( Drugstore drugstore, String ip);

}
