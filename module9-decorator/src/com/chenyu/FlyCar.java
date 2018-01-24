package com.chenyu;

/**
 * 飞行汽车
 *
 * @author yu_chen
 * @create 2018-01-24 18:03
 **/
public class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        car.move();
        System.out.println("天上飞");
    }
}
