package com.lichi.oauthserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author lichi
 * @create 2019-11-22 10:33
 */
@Controller
public class LoginController {
    /**
     * 登录页面
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
