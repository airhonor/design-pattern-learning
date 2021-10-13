package com.hz.design.pattern.adapter;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-13 11:15
 * @desc 充电器
 **/
public class PowerAdapter implements Target {

    private PatchBoard patchBoard;

    public PowerAdapter(PatchBoard patchBoard) {
        this.patchBoard = patchBoard;
    }

    @Override
    public Voltage charge() {
        Voltage voltage = patchBoard.giveVoltage();
        //电压转换
        voltage.setType("DC");
        voltage.setValue(5);
        return voltage;
    }
}
