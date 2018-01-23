package com.chenyu.abstractfactory;

/**
 * 低端汽车工厂类
 *
 * @author yu_chen
 * @create 2018-01-22 14:03
 **/
public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
