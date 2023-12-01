package com.smart.userCenter.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.smart.sso.client.rpc.SsoUser;
import com.smart.sso.client.util.SessionUtils;

/**
 * 功能描述
 *
 * @since 2023-12-01
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    @Autowired
    private DataSource dataSource;

    @RequestMapping(method = RequestMethod.GET)
    public String homePage(Model model, HttpServletRequest request) throws SQLException {
        SsoUser user = SessionUtils.getUser(request);
        model.addAttribute("userName", user.getUsername());
        model.addAttribute("sessionId", request.getSession().getId());
        model.addAttribute("pageName", "name");
        return "home";
    }
}
