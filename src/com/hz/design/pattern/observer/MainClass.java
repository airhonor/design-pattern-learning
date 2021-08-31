package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 11:18
 **/
public class MainClass {
    public static void main(String[] args) throws Exception {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        GameObserver gameObserver = new GameObserver();
        MovieObserver movieObserver = new MovieObserver();

        concreteSubject.addObserver(gameObserver);
        concreteSubject.addObserver(movieObserver);

        concreteSubject.notifyAll("有内鬼");

//        System.out.println("---------------------分界线----------------------");
//
//        ConcreteSource concreteSource = new ConcreteSource();
//
//        TvObserver tvObserver = new TvObserver();
//        AttachFishObserver attachFishObserver = new AttachFishObserver();
//
//        concreteSource.addListener(tvObserver, "stopWatchTv", "你老妈回来了");
//        concreteSource.addListener(attachFishObserver, "stopAttachFish", new Date());
//
//        concreteSource.subscribeNotice();
    }
}
