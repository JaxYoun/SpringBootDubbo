package com.yang.dao.mapper;

import com.yang.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author: Yang
 * @date: 2019/6/15 12:08
 * @description:
 */
@Mapper
public interface UserMapper {

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @Select("SELECT t.id AS id, t.name AS name, t.age AS age FROM t_user AS t WHERE t.id = ${id}")
    User getUserById(@Param("id") Integer id);

    /**
     * 插入用户
     *
     * @param user
     * @return
     */
    int updateUser(@Param("user") User user);

}
