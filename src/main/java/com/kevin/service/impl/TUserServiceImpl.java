package com.kevin.service.impl;

import com.kevin.dao.TuserDao;
import com.kevin.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kevin on 2017/5/26.
 */
@Service("userService")
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TuserDao userRepository;


}
