package com.chenyu;

/**
 * 客户端
 *
 * @author yu_chen
 * @create 2018-01-23 18:25
 **/
public class Client {

    public void test1(Adapter a) {
        a.handlerRequest();
    }

    public static void main(String[] args) {
        Client c = new Client();

        c.test1(new KeyToComputerAdapter(new KeyBoard()));
    }
}
