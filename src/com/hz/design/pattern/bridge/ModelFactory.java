package com.hz.design.pattern.bridge;

import lombok.AllArgsConstructor;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:55
 **/
public class ModelFactory {
    public String getModel(int code) {
        String model = "";
        switch (code) {
            case 1:
                model = Model.SUV.desc;
                break;
            case 2:
                model = Model.SEDAN.desc;
        }
        return model;
    }

    @AllArgsConstructor
    public enum Model {
        SUV(1, "越野车型"),
        SEDAN(2, "轿车");

        final int value;
        final String desc;

    }
}
