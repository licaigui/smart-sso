package com.smart.userCenter.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.smart.userCenter.service.UserService;

/**
 * 功能描述
 *
 * @since 2023-11-28
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllUsers(ModelAndView mv, HttpServletRequest request){
        return userService.getAllUser();
    }

}
