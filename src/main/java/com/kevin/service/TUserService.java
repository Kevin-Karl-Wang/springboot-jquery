package com.kevin.service;

import com.kevin.entity.Tuser;

/**
 * Created by kevin on 2017/5/26.
 */
public interface TUserService {


    String login(Tuser tuser);

    String register(Tuser tuser);
}
