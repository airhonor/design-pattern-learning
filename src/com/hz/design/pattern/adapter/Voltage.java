package com.hz.design.pattern.adapter;

import lombok.Builder;
import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-13 11:21
 **/
@Data
@Builder
public class Voltage {

    /**
     * 电压类型 交流(AC) 直流(DC)
     */
    private String type;
    /**
     * 电压值
     */
    private int value;
}
