package com.chenyu.factorymethod;

/**
 * 汽车工厂接口
 *
 * @author
 * @create 2018-01-22 13:41
 **/
public interface CarFactory {

    /**
     * 创建Car
     * @return Car
     */
    Car createCar();
}
