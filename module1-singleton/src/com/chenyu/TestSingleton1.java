package com.chenyu;

/**
 * 测试普通的单例
 *
 * @author yu_chen
 * @create 2018-01-22 9:55
 **/
public class TestSingleton1 {

    private static TestSingleton1 instance = new TestSingleton1();

    /**
     * 测试单例
     *
     * @return
     */
    public static TestSingleton1 getInstance() {

        return instance;
    }

    private TestSingleton1() {
        if (instance != null) {
            throw new RuntimeException();
        }
    }
}
