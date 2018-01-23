package com.chenyu.abstractfactory;

/**
 * 轮胎
 *
 * @author
 * @create 2018-01-22 14:00
 **/
public interface Tyre {

    /**
     * 旋转
     */
    void revolve();
}

/**
 * 高端轮胎
 */
class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("转的快");
    }
}

/**
 * 低端轮胎
 */
class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("转的慢");
    }
}