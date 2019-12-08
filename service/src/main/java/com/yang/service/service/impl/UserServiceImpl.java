package com.yang.service.service.impl;

import com.yang.common.constant.BaiscConst;
import com.yang.dao.mapper.UserMapper;
import com.yang.domain.entity.User;
import com.yang.idl.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/6/15 19:11
 * @description:
 */
@Service(interfaceClass = UserService.class, version = "${dubbo.provider.version}")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User getUser(Integer id) {
        System.out.println(BaiscConst.UNDER_LINE);
        return this.userMapper.getUserById(id);
    }

    @Override
    public boolean updateUser(User user) {
        return this.userMapper.updateUser(user) >= 0;
    }
}
