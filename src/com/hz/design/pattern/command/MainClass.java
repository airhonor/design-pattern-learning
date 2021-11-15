package com.hz.design.pattern.command;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-02 10:22
 **/
public class MainClass {
    public static void main(String[] args) {
        //招募厨师
        Cook cook = new Cook();
        //招募服务员
        Waiter waiter = new Waiter(new ConcreteCommand(cook));

        //营业点菜
        Menu menu1 = Menu.builder()
                .name("饺子")
                .num(2)
                .build();
        Menu menu2 = Menu.builder()
                .name("包子")
                .num(3)
                .build();
        waiter.order(menu1);
        waiter.order(menu2);

        //下单
        waiter.notifyOrder();
    }
}
