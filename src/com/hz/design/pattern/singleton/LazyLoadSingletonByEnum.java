package com.hz.design.pattern.singleton;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-29 11:21
 **/
public class LazyLoadSingletonByEnum {

    private LazyLoadSingletonByEnum() {
    }

    public static LazyLoadSingletonByEnum getInstance() {
        return SingletonEnum.INSTANCE.getInstance();
    }

    private enum SingletonEnum {
        INSTANCE;
        private LazyLoadSingletonByEnum instance;

        SingletonEnum() {
            instance = new LazyLoadSingletonByEnum();
        }

        public LazyLoadSingletonByEnum getInstance() {
            return instance;
        }
    }
}
