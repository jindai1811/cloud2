package com.serket.cloud.service;

import com.serket.cloud.bean.Drugstore;

/**
 * Created by WangYa on 2015/5/11.
 */
public interface DrugstoreService {
    /**
     * ���һ���̻�
     *
     * @param drugstore �̻���Ϣ
     */
    public void addDrugstore(Drugstore drugstore);

    /**
     * ��¼
     * @param name �û���
     * @param password ����
     * @return accessToken
     *
     */
    public String login(String name,String password);

}
