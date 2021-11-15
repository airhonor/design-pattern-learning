package com.hz.design.pattern.chain.responsibility;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-15 11:40
 **/
public abstract class AbstractHandler {

    /**
     * 处理者的姓名
     */
    protected final String name;

    /**
     * 下一位处理该事物的人员
     */
    protected AbstractHandler next;

    public AbstractHandler(String name) {
        this.name = name;
    }

    public void setNext(AbstractHandler abstractHandler) {
        this.next = abstractHandler;
    }

    /**
     * 处理请假需求
     *
     * @param requestHoliday 申请假相关信息
     */
    public abstract void handleRequest(RequestHoliday requestHoliday);
}
