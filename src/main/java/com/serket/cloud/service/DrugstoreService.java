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
     * �̻���¼
     * @param drugstore �û���¼��Ϣ
      * @param ip ��¼��ip
     * @return �ɹ�����accessToken,ʧ�ܷ���null
     */
    public String login( Drugstore drugstore, String ip);

}
