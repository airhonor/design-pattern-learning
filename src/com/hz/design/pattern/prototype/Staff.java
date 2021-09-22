package com.hz.design.pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-15 10:56
 **/

@Data
@AllArgsConstructor
public class Staff implements Cloneable, Serializable {

    /**
     * 金箍棒的尺寸
     */
    private int size;

}
