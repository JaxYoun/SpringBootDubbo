package com.yang.domain.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: Yang
 * @date: 2019/6/15 19:08
 * @description:
 */
@Data
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

}
