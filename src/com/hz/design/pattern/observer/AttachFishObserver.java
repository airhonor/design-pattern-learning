package com.hz.design.pattern.observer;

import java.util.Date;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 15:18
 **/
public class AttachFishObserver {

    public void stopAttachFish(Date date){
        System.out.println("赶快别看摸鱼了, 这都什么时候了" + date);
    }
}
