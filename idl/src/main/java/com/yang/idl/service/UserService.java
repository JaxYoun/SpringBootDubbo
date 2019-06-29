package com.yang.idl.service;

import com.yang.domain.entity.User;

/**
 * @author: Yang
 * @date: 2019/6/15 19:07
 * @description:
 */
public interface UserService {

    /**
     * 根据id获取用户
     *
     * @param id
     * @return
     */
    User getUser(Integer id);

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    boolean updateUser(User user);

}
