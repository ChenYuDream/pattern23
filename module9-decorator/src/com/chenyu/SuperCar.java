package com.chenyu;

/**
 * 超级汽车
 *
 * @author yu_chen
 * @create 2018-01-24 18:13
 **/
public class SuperCar extends Car {

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}
