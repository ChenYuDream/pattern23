package com.chenyu;

/**
 * @author yu_chen
 * @create 2018-01-24 17:19
 **/
public class Client {

    public static void main(String[] args) {
        Brand brand = new HuaweiBrand();
        Computer computer = new IpadComputer();
        Bridge bridge = new Bridge(computer, brand);
        bridge.sale();
    }
}
