package com.modds.spearl.core.service.controller;

import com.modds.spearl.user.api.UserApi;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @DubboReference
    private UserApi userApi;

    @GetMapping("/name")
    private String getUserName() {
        return userApi.getUserName(1);
    }
}
