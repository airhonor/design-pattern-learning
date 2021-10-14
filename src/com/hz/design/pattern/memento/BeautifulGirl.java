package com.hz.design.pattern.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-14 10:44
 **/
@Data
@AllArgsConstructor
public class BeautifulGirl {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 擅长的才艺
     */
    private String art;
}
