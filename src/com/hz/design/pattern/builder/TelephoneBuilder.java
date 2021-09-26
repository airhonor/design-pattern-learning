package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 12:06
 **/
public interface TelephoneBuilder {

    /**
     * 组装主板
     *
     * @return 手机构建者
     */
    TelephoneBuilder constructBoard();

    /**
     * 组装cpu
     *
     * @return 手机构建者
     */
    TelephoneBuilder constructCpu();

    /**
     * 组装存储
     *
     * @return 手机构建者
     */
    TelephoneBuilder constructMemory();

    /**
     * 组长手机壳
     *
     * @return 手机构建者
     */
    TelephoneBuilder constructCase();

    /**
     * 返回电脑成品
     *
     * @return 电脑
     */
    Telephone getTelephone();
}
