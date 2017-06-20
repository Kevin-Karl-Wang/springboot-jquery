package com.kevin.controller;

import com.kevin.entity.Tuser;
import com.kevin.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by kevin on 2017/5/26.
 */
@Controller
public class TuserController {

    @Autowired
    private TUserService userService;


    @GetMapping("/findAll")
    public List<Tuser> findAll() {
        try {
            return userService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}