package com.hz.design.pattern.strategy;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-03 10:53
 **/


public interface WayToWorkStrategy {

    /**
     * 如何去上班
     *
     * @return 上班方式
     */
    String chooseWayToWork();
}
