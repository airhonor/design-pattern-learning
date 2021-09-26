package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 11:11
 **/
public interface ComputerBuilder {

    /**
     * 组装主板
     */
    void constructBoard();

    /**
     * 组装cpu
     */
    void constructCpu();

    /**
     * 组装内存条
     */
    void constructMemory();

    /**
     * 组装硬盘
     */
    void constructHardDisk();

    /**
     * 组长机箱壳
     */
    void constructCase();

    /**
     * 返回电脑成品
     *
     * @return 电脑
     */
    Computer getComputer();
}
