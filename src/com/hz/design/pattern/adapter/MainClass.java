package com.hz.design.pattern.adapter;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-13 11:05
 **/
public class MainClass {

    public static void main(String[] args) {
        //想要给手机充电
        //1.找到插线板
        PatchBoard patchBoard = new PatchBoard();
        Voltage voltageAc = patchBoard.giveVoltage();
        System.out.println("插板给电：" + voltageAc);
        //2.拿出电源适配器
        Target target = new PowerAdapter(patchBoard);
        //3.充电
        Voltage voltageDc = target.charge();
        System.out.println("适配器给电：" + voltageDc);

    }
}
