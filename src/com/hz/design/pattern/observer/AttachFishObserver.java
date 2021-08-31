package com.hz.design.pattern.observer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 15:18
 **/
public class AttachFishObserver {

    public void stopAttachFish(Date date) {
        SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(f.format(date));
        System.out.println("赶快别看摸鱼了, 看看时间啊，我的哥");
    }
}
