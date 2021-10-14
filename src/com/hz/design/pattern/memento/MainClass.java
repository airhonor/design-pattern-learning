package com.hz.design.pattern.memento;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-14 10:38
 **/
public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        BeautifulGirl[] girls = new BeautifulGirl[]{
                new BeautifulGirl("貂蝉", 22, "跳舞"),
                new BeautifulGirl("西施", 18, "画画"),
                new BeautifulGirl("王昭君", 20, "弹琵琶"),
                new BeautifulGirl("杨玉环", 19, "唱歌")
        };

        //从第一个开始选择
        Originator originator = new Originator(girls[0]);
        Caretaker caretaker = new Caretaker();
        //存储选择的第一个
        caretaker.setMemento(1, originator.createMemento());
        //选择第二个
        originator.setGirl(girls[1]);
        //存储第二个
        caretaker.setMemento(2, originator.createMemento());
        //选择第三个
        originator.setGirl(girls[2]);
        //存储第三个
        caretaker.setMemento(3, originator.createMemento());
        //选择第四个
        originator.setGirl(girls[3]);
        //存储第四个
        caretaker.setMemento(4, originator.createMemento());

        //最后到底选择第几个了？
        originator.restoreMemento(caretaker.getMemento(3));

        System.out.println(originator.getGirl());
    }
}
