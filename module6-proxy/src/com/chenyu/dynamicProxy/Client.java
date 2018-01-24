package com.chenyu.dynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @author yu_chen
 * @create 2018-01-24 16:38
 **/
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxyStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);

        proxyStar.bookTicket();
        int sing = proxyStar.sing();
        System.out.println(sing);
    }
}
