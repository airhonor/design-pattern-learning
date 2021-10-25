package com.hz.design.pattern.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-22 15:23
 **/
@Data
@AllArgsConstructor
public class User {
    /**
     * 用户名
     */
    private String name;

    /**
     * 简介
     */
    private String desc;

}
