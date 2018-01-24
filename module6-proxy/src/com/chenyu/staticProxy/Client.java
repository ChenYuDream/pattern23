package com.chenyu.staticProxy;

/**
 * @author yu_chen
 * @create 2018-01-24 16:20
 **/
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar = new ProxyStar(realStar);

        proxyStar.confer();
        proxyStar.signContract();
        proxyStar.bookTicket();

        proxyStar.sing();

        proxyStar.collectMoney();
    }
}
