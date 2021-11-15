package com.hz.design.pattern.command;

import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:48
 **/
public interface Command {
    /**
     * 做菜
     *
     * @param menuMap 菜的内容
     */
    void execute(Map<String, Integer> menuMap);
}
