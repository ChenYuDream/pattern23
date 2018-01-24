package com.chenyu;

/**
 * 飞行汽车
 *
 * @author yu_chen
 * @create 2018-01-24 18:03
 **/
public class WaterCar extends SuperCar {


    public WaterCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        car.move();
        System.out.println("水里游");
    }
}
