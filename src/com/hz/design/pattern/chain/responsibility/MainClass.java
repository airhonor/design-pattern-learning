package com.hz.design.pattern.chain.responsibility;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-15 14:12
 **/
public class MainClass {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader("组长");
        Manager manager = new Manager("经理");
        Majordomo majordomo = new Majordomo("总监");


        groupLeader.setNext(manager);
        manager.setNext(majordomo);

        RequestHoliday requestHoliday1 = RequestHoliday.builder()
                .reason("身体欠佳去医院看看")
                .holidayDays(1)
                .result("申请中")
                .build();
        groupLeader.handleRequest(requestHoliday1);

        RequestHoliday requestHoliday2 = RequestHoliday.builder()
                .reason("去外地探亲")
                .holidayDays(5)
                .result("申请中")
                .build();
        groupLeader.handleRequest(requestHoliday2);

        RequestHoliday requestHoliday3 = RequestHoliday.builder()
                .reason("出去看世界")
                .holidayDays(10)
                .result("申请中")
                .build();
        groupLeader.handleRequest(requestHoliday3);

    }
}
