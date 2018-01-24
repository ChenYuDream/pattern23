package com.chenyu;

/**
 * @author yu_chen
 * @create 2018-01-24 18:09
 **/
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        FlyCar flyCar = new FlyCar(new Car());
        flyCar.move();
        System.out.println("==============");
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
