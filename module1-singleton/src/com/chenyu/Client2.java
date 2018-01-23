package com.chenyu;

import java.util.concurrent.CountDownLatch;

/**
 * 测试效率
 *
 * @author yu_chen
 * @create 2018-01-22 11:36
 **/
public class Client2 {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        final CountDownLatch countDownLatch = new CountDownLatch(10);

        //启动十个线程
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    TestSingleton1.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }

        countDownLatch.await();
        long endTime = System.currentTimeMillis();

        System.out.println("总耗时："+(endTime - startTime));
    }
}
