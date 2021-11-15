package com.hz.design.pattern.command;

import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:48
 **/
public class ConcreteCommand implements Command {

    private Cook cook;

    public ConcreteCommand(Cook cook) {
        this.cook = cook;
    }

    /**
     * 做菜
     *
     * @param menuMap 菜的内容
     */
    @Override
    public void execute(Map<String, Integer> menuMap) {
        cook.cook(menuMap);
    }
}
