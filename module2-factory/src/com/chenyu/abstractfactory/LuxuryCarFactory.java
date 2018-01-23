package com.chenyu.abstractfactory;

/**
 * 高端汽车工厂类
 *
 * @author yu_chen
 * @create 2018-01-22 14:03
 **/
public class LuxuryCarFactory implements CarFactory {


    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
