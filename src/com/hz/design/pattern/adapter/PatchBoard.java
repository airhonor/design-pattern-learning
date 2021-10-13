package com.hz.design.pattern.adapter;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-13 11:07
 * @desc: 插线板，设计好以后不允许修改
 **/
public final class PatchBoard {

    public Voltage giveVoltage() {
        return Voltage.builder()
                .type("AC")
                .value(220)
                .build();
    }
}
