package com.kevin.controller;

import com.kevin.entity.Tuser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kevin on 2017/5/20.
 * <p>
 * http://www.thinkphp.cn/code/2442.html  前端参考
 */
@Controller
public class IndexController {

    /**
     * 登录
     *
     * @return
     */
    @RequestMapping("/login.do")
    public String login(Tuser tuser, Model model) {
        try {
//            Tuser tuser = (Tuser) SecurityUtils.getSubject().getPrincipals().getPrimaryPrincipal();
            if (tuser.getPassword() != null) {
                model.addAttribute("account", "admin");
                return "redirect:/index.do";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "login";
    }

    @RequestMapping("/index.do")
    public String index(Tuser tuser) {
        return "index";
    }

    @RequestMapping("/register.do")
    public String register() {
        return "register";
    }


}
