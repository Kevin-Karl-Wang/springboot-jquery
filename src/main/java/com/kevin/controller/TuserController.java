package com.kevin.controller;

import com.kevin.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by kevin on 2017/5/26.
 */
@Controller
public class TuserController {

    @Autowired
    private TUserService userService;



}