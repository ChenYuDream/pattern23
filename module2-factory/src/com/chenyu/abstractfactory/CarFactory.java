package com.chenyu.abstractfactory;

/**
 * 汽车工厂接口
 *
 * @author
 * @create 2018-01-22 14:01
 **/
public interface CarFactory {
    /**
     * 创建引擎
     *
     * @return
     */
    Engine createEngine();

    /**
     * 创建座椅
     *
     * @return
     */
    Seat createSeat();

    /**
     * 创建轮胎
     *
     * @return
     */
    Tyre createTyre();

}
