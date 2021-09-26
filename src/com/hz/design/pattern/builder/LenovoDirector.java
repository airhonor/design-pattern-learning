package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 11:31
 **/
public class LenovoDirector {

    private ComputerBuilder computerBuilder;

    public LenovoDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }


    public Computer getComputer() {
        computerBuilder.constructBoard();
        computerBuilder.constructCpu();
        computerBuilder.constructMemory();
        computerBuilder.constructHardDisk();
        computerBuilder.constructCase();

        return computerBuilder.getComputer();
    }
}
