package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 11:20
 **/
public class FoxconnBuilder implements ComputerBuilder {

    private Computer computer = new Computer();

    @Override
    public void constructBoard() {
        computer.components.add("lenovo board");
    }

    @Override
    public void constructCpu() {
        computer.components.add("lenovo cpu");
    }

    @Override
    public void constructMemory() {
        computer.components.add("lenovo memory");
    }

    @Override
    public void constructHardDisk() {
        computer.components.add("lenovo hard disk");
    }

    @Override
    public void constructCase() {
        computer.components.add("lenovo case");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
