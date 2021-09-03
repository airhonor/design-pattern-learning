package com.hz.design.pattern.strategy;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-03 10:56
 **/
public class BicycleWay implements WayToWorkStrategy {

    @Override
    public String chooseWayToWork() {
        return "骑自行车去上班";
    }
}
