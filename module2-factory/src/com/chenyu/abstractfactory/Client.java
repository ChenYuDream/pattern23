package com.chenyu.abstractfactory;

/**
 * @author yu_chen
 * @create 2018-01-22 14:05
 **/
public class Client {

    public static void main(String[] args) {
        CarFactory luxuryCar = new LuxuryCarFactory();
        Engine engine = luxuryCar.createEngine();
        engine.run();


        CarFactory lowCar = new LowCarFactory();
        Engine lowEngine = lowCar.createEngine();
        lowEngine.run();
    }
}
