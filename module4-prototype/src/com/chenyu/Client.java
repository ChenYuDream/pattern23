package com.chenyu;

import java.io.IOException;

/**
 * @author yu_chen
 * @create 2018-01-23 18:13
 **/
public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car car = new Car();
        car.setName("aa");
        Car o = (Car) car.deepClone();
        System.out.println(o.getName());
    }
}
