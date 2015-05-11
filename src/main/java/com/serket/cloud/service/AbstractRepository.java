package com.serket.cloud.service;

import com.serket.cloud.bean.Persion;

import java.util.List;

/**
 * Created by Administrator on 2015/5/10.
 */
public interface AbstractRepository {
    public void insert(Persion person);

    public List<Persion> findAll();

}
