package com.lichi.oauthserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author lichi
 * @create 2019-11-22 10:35
 */
@RestController
public class UserController {

    /**
     * 资源服务器提供受保护的接口
     * @param principal
     * @return
     */
    @RequestMapping("/user")
    public Principal user(Principal principal) {
        System.out.println(principal);
        return principal;
    }
}
