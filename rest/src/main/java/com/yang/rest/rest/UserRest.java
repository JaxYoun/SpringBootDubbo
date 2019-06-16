package com.yang.rest.rest;

import com.yang.domain.entity.User;
import com.yang.idl.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yang
 * @date: 2019/6/15 22:07
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserRest {

    @Reference(version = "${dubbo.provider.version}")
    private UserService userService;

    @GetMapping("/getUserById/{id}")
    public User getUser(@PathVariable Integer id) {
        return this.userService.getUser(id);
    }

}
