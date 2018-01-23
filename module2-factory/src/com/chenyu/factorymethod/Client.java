package com.chenyu.factorymethod;

/**
 * 客户端
 *
 * @author yu_chen
 * @create 2018-01-22 13:45
 **/
public class Client {

    public static void main(String[] args) {

        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();

        audi.run();
        byd.run();
    }
}
