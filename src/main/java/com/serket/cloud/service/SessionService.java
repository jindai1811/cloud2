package com.serket.cloud.service;

import com.serket.cloud.bean.SessionInfo;

/**
 * Created by WangYa on 2015/5/11.
 */
public interface SessionService {

    /**
     * ��ȡsession��Ϣ
     * @param accessToken ����
     * @return session��Ϣ
     */
    public SessionInfo getSessionInfo(String accessToken);
}
