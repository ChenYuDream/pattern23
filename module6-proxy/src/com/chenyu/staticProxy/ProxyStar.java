package com.chenyu.staticProxy;

/**
 * 代理明星
 *
 * @author yu_chen
 * @create 2018-01-24 16:19
 **/
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()");
    }

    @Override
    public void signContract() {
        System.out.println("ProxyStar.signContract()");
    }

    @Override
    public void bookTicket() {
        System.out.println("ProxyStar.bookTicket()");
    }

    @Override
    public void sing() {
        star.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxyStar.collectMoney()");
    }
}
