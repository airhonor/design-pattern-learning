package com.hz.design.pattern.strategy;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-03 10:59
 **/
public class ContextStrategy {
    WayToWorkStrategy wayToWorkStrategy;
    private String climate;

    public ContextStrategy(String climate) {
        this.climate = climate;
        this.wayToWorkStrategy = chooseContextStrategy();
    }

    private WayToWorkStrategy chooseContextStrategy() {
        //简单工厂模式
        switch (climate) {
            case "sun":
                return new BicycleWay();
            case "rain":
                return new SubwayWay();
            case "wind":
                return new CarWay();
            case "snow":
                return new WalkWay();
            default:
                return null;
        }
    }

    /**
     * 获取上班策略
     *
     * @return 上班策略
     */
    public String showWayToWork() {
        if (wayToWorkStrategy == null) {
            return "天气不符合要求，无法上班，好开心";
        }
        return wayToWorkStrategy.chooseWayToWork();
    }
}
