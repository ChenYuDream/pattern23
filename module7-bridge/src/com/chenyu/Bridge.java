package com.chenyu;

/**
 * 桥接
 *
 * @author yu_chen
 * @create 2018-01-24 17:18
 **/
public class Bridge {

    private Computer computer;

    private Brand brand;

    public Bridge(Computer computer, Brand brand) {
        this.computer = computer;
        this.brand = brand;
    }

    /**
     * 销售
     */
    public void sale() {
        brand.sale();
        computer.sale();
    }
}
