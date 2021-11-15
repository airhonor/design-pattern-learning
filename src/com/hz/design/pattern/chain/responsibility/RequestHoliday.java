package com.hz.design.pattern.chain.responsibility;

import lombok.Builder;
import lombok.Data;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-11-15 13:48
 **/
@Data
@Builder
public class RequestHoliday {

    /**
     * 理由
     */
    private String reason;

    /**
     * 请假时间，单位：天
     */
    private int holidayDays;

    /**
     * 状态，是否批准
     */
    private String result;

    /**
     * 备注
     */
    private String remark;
}
