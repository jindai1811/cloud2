package com.serket.cloud.service;

import com.serket.cloud.bean.SessionInfo;

/**
 * Created by WangYa on 2015/5/11.
 */
public interface SessionService {

    /**
     * 获取session信息
     * @param accessToken 令牌
     * @return session信息
     */
    public SessionInfo getSessionInfo(String accessToken);
}
