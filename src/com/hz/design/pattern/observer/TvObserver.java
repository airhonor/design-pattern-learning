package com.hz.design.pattern.observer;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 15:18
 **/
public class TvObserver {

    public void stopWatchTv(String reason){
        System.out.println("赶快别看电视了, " + reason);
    }
}
