package com.chenyu.abstractfactory;

/**
 * 座椅
 *
 * @author
 * @create 2018-01-22 13:56
 **/
public interface Seat {

    /**
     * 按摩
     */
    void massage();


}

/**
 * 奢侈品的座椅
 */
class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以按摩");
    }
}


/**
 * 低端座椅
 */
class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩");
    }
}