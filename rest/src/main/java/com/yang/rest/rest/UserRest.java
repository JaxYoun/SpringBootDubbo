package com.yang.rest.rest;

import com.yang.common.constant.BaiscConst;
import com.yang.common.util.DateUtil;
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

    //引用服务
    @Reference(interfaceClass = UserService.class, version = "${dubbo.provider.version}")
    private UserService userService;

    @GetMapping("/getUserById/{id}")
    public User getUser(@PathVariable Integer id) {
        System.out.println(this.function(() -> BaiscConst.UNDER_LINE));
        return this.userService.getUser(id);
    }

    private String function(DateUtil fun) {
        return fun.doSomething();
    }

    @GetMapping("/updateUser/{id}/{name}/{age}")
    public boolean updateUser(@PathVariable("id") Integer id, @PathVariable("name") String name, @PathVariable("age") Integer age) {
        User user = User.builder()
                .id(id)
                .name(name)
                .age(age)
                .build();
        return this.userService.updateUser(user);
    }

}
