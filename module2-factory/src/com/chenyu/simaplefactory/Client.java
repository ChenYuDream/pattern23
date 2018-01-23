package com.chenyu.simaplefactory;

/**
 * @author yu_chen
 * @create 2018-01-22 12:15
 **/
public class Client {

    public static void main(String[] args) {

        Audi audi = CarFactory.getAudiInstance();
        Byd byd = CarFactory.getBydInstance();
        audi.run();
        byd.run();
    }
}
