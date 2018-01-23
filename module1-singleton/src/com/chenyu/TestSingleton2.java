package com.chenyu;

/**
 * 测试懒汉式单例
 *
 * @author yu_chen
 * @create 2018-01-22 9:58
 **/
public class TestSingleton2 {

    private static TestSingleton2 instance;

    public static TestSingleton2 getInstance() {
        if (instance == null) {
            instance = new TestSingleton2();
        }
        return instance;
    }

    private TestSingleton2() {

    }
}
