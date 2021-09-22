package com.hz.design.pattern.prototype;

import lombok.Data;

import java.io.*;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-09-15 09:49
 **/
@Data
public class SunWuKong implements Cloneable, Serializable {

    /**
     * 表示孙悟空几号
     */
    private int number;

    /**
     * 孙悟空技能描述
     */
    private String desc;


    /**
     * 兵器尺寸
     */
    private Staff staff;

    /**
     * 浅复制
     *
     * @return 孙悟空
     * @throws CloneNotSupportedException 不支持复制异常
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        SunWuKong sunWuKong = (SunWuKong) super.clone();
        //sunWuKong.staff = (Staff) staff.clone();
        return sunWuKong;
    }


    public Object deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }
}


