package com.hz.design.pattern.builder;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-26 11:08
 **/
public class MainClass {
    public static void main(String[] args) {
        LenovoDirector lenovoDirector = new LenovoDirector(new FoxconnBuilder());
        Computer computer = lenovoDirector.getComputer();
        computer.show();

        System.out.println("************************************");
        QuantaBuilder quantaBuilder = new QuantaBuilder();
        Telephone telephone = quantaBuilder.
                constructBoard()
                .constructMemory()
                .constructCpu()
                .constructCase()
                .getTelephone();
        telephone.show();
    }
}
