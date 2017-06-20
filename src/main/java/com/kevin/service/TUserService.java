package com.kevin.service;

import com.kevin.entity.Tuser;

import java.util.List;

/**
 * Created by kevin on 2017/5/26.
 */
public interface TUserService {

    List<Tuser> findUserByName(Tuser tuser);
    List<Tuser> findAll();
}
