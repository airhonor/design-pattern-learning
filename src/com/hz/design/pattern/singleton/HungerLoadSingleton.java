package com.hz.design.pattern.singleton;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-29 11:21
 **/
public class HungerLoadSingleton {
    private static HungerLoadSingleton hungerLoadSingleton = new HungerLoadSingleton();

    private HungerLoadSingleton() {
    }

    public static HungerLoadSingleton getInstance() {
        return hungerLoadSingleton;
    }
}
