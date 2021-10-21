package com.hz.design.pattern.composite;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-21 11:06
 **/
public interface Company {

    /**
     * 获取公司名称
     *
     * @return 名称
     */
    String getName();

    /**
     * 添加
     *
     * @param c 公司
     */
    void add(Company c);

    /**
     * 移除
     *
     * @param c 公司
     */
    void remove(Company c);

    /**
     * 显示
     *
     * @param depth 层级
     */
    void disPlay(int depth);

    /**
     * 展示职责
     */
    void displayDuty();
}
