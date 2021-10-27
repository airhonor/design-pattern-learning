package com.hz.design.pattern.MyIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-26 10:49
 **/
public class MainClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
