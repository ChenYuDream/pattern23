package com.chenyu;

/**
 * 电脑
 *
 * @author
 * @create 2018-01-24 17:14
 **/
public interface Computer {

    /**
     * 销售电脑
     */
    void sale();
}

/**
 * 台式机
 */
class DesctopComputer implements Computer {

    @Override
    public void sale() {
        System.out.println("台式机");
    }
}

/**
 * 平板
 */
class IpadComputer implements Computer {

    @Override
    public void sale() {
        System.out.println("平板电脑");
    }
}