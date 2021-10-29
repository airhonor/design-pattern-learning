package com.hz.design.pattern.singleton;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-29 11:21
 **/
public class LazyLoadSingletonByInnerClass {

    private LazyLoadSingletonByInnerClass() {
    }

    public static LazyLoadSingletonByInnerClass getInstance() {
        return InstanceHolder.instance;
    }

    private static class InstanceHolder {
        private static final LazyLoadSingletonByInnerClass instance = new LazyLoadSingletonByInnerClass();
    }
}
