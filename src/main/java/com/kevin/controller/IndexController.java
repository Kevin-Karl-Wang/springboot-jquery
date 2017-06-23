package com.kevin.controller;

import com.kevin.entity.Tuser;
import com.kevin.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by kevin on 2017/5/20.
 * <p>
 * http://www.thinkphp.cn/code/2442.html  前端参考
 */
@Controller
public class IndexController {

    @Autowired
    private TUserService userService;

    @RequestMapping("/index.do")
    public String index(Tuser tuser) {
        return "index";
    }

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("/login.do")
    @ResponseBody
    public String login(Tuser tuser) {
        if (tuser != null) {
            String login = userService.login(tuser);
            return login;
        }
        return "null";
    }

    /**
     * 注册
     *
     * @return
     */
    @RequestMapping("/register.do")
    @ResponseBody
    public String register(Tuser tuser) {
        if (tuser != null) {
            String register = userService.register(tuser);
            return register;
        }
        return "register";
    }


    @RequestMapping("/main.do")
    public String toMain() {
        return "main";
    }

}
