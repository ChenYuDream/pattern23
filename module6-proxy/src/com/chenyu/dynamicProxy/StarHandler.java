package com.chenyu.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yu_chen
 * @create 2018-01-24 16:32
 **/
public class StarHandler implements InvocationHandler {

    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
        if ("sing".equals(method.getName())) {
            o = method.invoke(realStar, args);
        }
        return o;
    }
}
