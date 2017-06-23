package com.kevin.service.impl;

import com.kevin.dao.TuserDao;
import com.kevin.entity.Tuser;
import com.kevin.service.TUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by kevin on 2017/5/26.
 */
@Service("userService")
public class TUserServiceImpl implements TUserService {

    @Resource
    private TuserDao userDao;


    @Override
    public String login(Tuser tuser) {
        List<Tuser> tusers = userDao.login(tuser);
        if (!tusers.isEmpty() && tusers.size() > 0) {
            return "进入主页面";
        }
        return "请注册！";
    }

    @Transactional
    public String register(Tuser tuser) {
        List<Tuser> tusers = userDao.login(tuser);
        if (!tusers.isEmpty() && tusers.size() > 0) {
            return "该用户已经存在！";
        } else {
            userDao.register(tuser);
            return "register success";
        }
    }

}
