package com.hz.design.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:28
 **/
public class Waiter {
    Map<String, Integer> menuMap = new HashMap<>();

    private Command command;

    public Waiter(Command command) {
        this.command = command;
    }

    public void order(Menu menu) {
        //点菜
        if (menuMap.containsKey(menu.getName())) {
            int num = menuMap.get(menu.getName());
            menuMap.put(menu.getName(), num);
        } else {
            menuMap.put(menu.getName(), menu.getNum());
        }
    }

    public void cancelOrder(Menu menu) {
        if (!menuMap.containsKey(menu.getName())) {
            System.out.println("您没点此菜");
        } else {
            int num = menuMap.get(menu.getName());
            if (num == 1) {
                menuMap.remove(menu.getName());
            } else {
                menuMap.put(menu.getName(), num - 1);
            }
        }
    }

    public void notifyOrder() {
        command.execute(menuMap);
    }
}
