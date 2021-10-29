package com.hz.design.pattern.singleton;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-29 11:21
 **/
public class LazyLoadSingletonByLock {
    private static volatile LazyLoadSingletonByLock lazyLoadSingletonByLock = null;

    private LazyLoadSingletonByLock() {
    }

    public static LazyLoadSingletonByLock getInstance() {
        //双重锁定
        if (lazyLoadSingletonByLock == null) {
            synchronized (LazyLoadSingletonByLock.class) {
                if (lazyLoadSingletonByLock == null) {
                    lazyLoadSingletonByLock = new LazyLoadSingletonByLock();
                }
            }
        }
        return lazyLoadSingletonByLock;
    }
}
