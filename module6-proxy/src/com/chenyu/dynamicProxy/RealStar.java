package com.chenyu.dynamicProxy;

/**
 * 真实角色
 *
 * @author yu_chen
 * @create 2018-01-24 16:17
 **/
public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("RealStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("RealStar.bookTicket()");
    }

    @Override
    public int sing() {
        System.out.println("RealStar(周杰伦本人).sing()");
        return 99;
    }

    @Override
    public void collectMoney() {
        System.out.println("RealStar.collectMoney()");
    }
}
