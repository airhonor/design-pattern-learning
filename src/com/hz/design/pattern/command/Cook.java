package com.hz.design.pattern.command;

import java.text.MessageFormat;
import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:54
 **/
public class Cook {

    public void cook(Map<String, Integer> menuMap) {
        for (String key : menuMap.keySet()) {
            System.out.println(MessageFormat.format("收到制作{0}份{1}的单子了，马上做", menuMap.get(key), key));
        }
    }
}
