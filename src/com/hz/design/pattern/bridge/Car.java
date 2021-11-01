package com.hz.design.pattern.bridge;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:26
 **/
public interface Car {

    /**
     * 选择颜色
     *
     * @param code 颜色编号
     */
    void setColor(int code);

    /**
     * 选择车型
     *
     * @param code 车型编号
     */
    void setModel(int code);
}
