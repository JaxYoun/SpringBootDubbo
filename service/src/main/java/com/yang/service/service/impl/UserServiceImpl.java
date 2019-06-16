package com.yang.service.service.impl;

import com.yang.domain.entity.User;
import com.yang.idl.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author: Yang
 * @date: 2019/6/15 19:11
 * @description:
 */
@Service(version = "${dubbo.provider.version}")
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer id) {
        System.out.println("---------" + id);
        User user = new User();
        user.setId(id);
        user.setAge(id);
        user.setName("yang");
        return user;
    }
}
