package com.chenyu.factorymethod;

/**
 * 奥迪工厂类
 *
 * @author yu_chen
 * @create 2018-01-22 13:42
 **/
public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }
}
