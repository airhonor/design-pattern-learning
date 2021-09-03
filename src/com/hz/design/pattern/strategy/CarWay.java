package com.hz.design.pattern.strategy;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-03 10:56
 **/
public class CarWay implements WayToWorkStrategy {

    @Override
    public String chooseWayToWork() {
        return "开车去上班";
    }
}
