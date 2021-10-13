package com.hz.design.pattern.adapter;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-13 11:15
 **/
public interface Target {

    /**
     * 充电
     *
     * @return 5v 直流电
     */
    Voltage charge();
}
