package com.chenyu;

/**
 * 测试双重检测锁模式
 * 由于JVM底层原因 这个偶尔会出问题
 *
 * @author yu_chen
 * @create 2018-01-22 9:58
 **/
public class TestSingleton3 {

    private static TestSingleton3 instance = null;

    public static TestSingleton3 getInstance() {
        if (instance == null) {
            TestSingleton3 sc;
            synchronized (TestSingleton3.class) {
                sc = instance;
                if (sc == null) {
                    synchronized (TestSingleton3.class) {
                        if (sc == null) {
                            sc = new TestSingleton3();
                        }
                    }
                    instance = sc;
                }
            }
        }
        return instance;
    }

    private TestSingleton3() {

    }

}
