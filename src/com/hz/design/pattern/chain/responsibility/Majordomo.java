package com.hz.design.pattern.chain.responsibility;


/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-15 13:56
 **/
public class Majordomo extends AbstractHandler {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void handleRequest(RequestHoliday requestHoliday) {
        if (requestHoliday.getHolidayDays() > 7) {
            //这里经理根据理由与实际情况判断准不准假，此处直接批准，不批准，可以填写备注
            requestHoliday.setResult("拒绝");
            requestHoliday.setRemark("请假时间太长");
            System.out.println(name + "审批员工" + requestHoliday.getReason()
                    + "的请假条，请假天数为" + requestHoliday.getHolidayDays() + "天，" +
                    "审批结果为：" + requestHoliday.getResult() + "。");
        } else {
            if (this.next != null) {
                this.next.handleRequest(requestHoliday);
            }
        }
    }
}
