package com.hz.design.pattern.bridge;

import lombok.AllArgsConstructor;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-01 14:55
 **/
public class ColorFactory {
    public String getColor(int code) {
        String color = "";
        switch (code) {
            case 1:
                color = Color.YELLOW.desc;
                break;
            case 2:
                color = Color.RED.desc;
                break;
            case 3:
                color = Color.WHITE.desc;
                break;
            case 4:
                color = Color.BLACK.desc;
                break;
            case 5:
                color = Color.GREEN.desc;
                break;
        }
        return color;
    }

    @AllArgsConstructor
    public enum Color {
        YELLOW(1, "yellow"),
        RED(2, "red"),
        WHITE(3, "white"),
        BLACK(4, "black"),
        GREEN(5, "green");

        final int value;
        final String desc;

    }
}
