package com.hz.design.pattern.observer;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Method;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-08-31 14:14
 **/
@Data
@Setter
@Getter
public class Event {

    /**
     * 委托事件者
     */
    private Object object;

    /**
     * 委托执行的方法
     */
    private String methodName;

    /**
     * 委托执行的方法参数
     */
    private Object[] params;

    /**
     * 执行方法的参数类型
     */
    private Class[] paramTypes;

    public Event(){
        //无参构造
    }
    public Event(Object object, String methodName, Object...params){
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(this.params);
    }

    /**
     *构造参数类型数组
     *
     */
    private void contractParamTypes(Object[] params){
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }

    /**
     *执行委托的方法
     *
     */
    public void invoke() throws Exception {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        method.invoke(this.object, this.params);
    }

}
