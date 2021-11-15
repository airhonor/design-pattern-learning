package com.hz.design.pattern.command;

import lombok.Builder;
import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:23
 **/
@Data
@Builder
public class Menu {

    /**
     * 菜名
     */
    private String name;

    /**
     * 数量
     */
    private int num;

}
