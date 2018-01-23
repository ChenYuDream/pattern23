package com.chenyu;

/**
 * 测试静态内部类
 * 该实现方式比较简单，而且既实现了由前述事实所保证的惰性初始化（Lazy-Initialazation），又由JVM保证了多线程并发访问的正确性
 *
 * @author yu_chen
 * @create 2018-01-22 10:40
 **/
public class TestSingleton4 {

    private static class Instance {
        private static final TestSingleton4 instance = new TestSingleton4();
    }

    public TestSingleton4 getInstance() {
        return Instance.instance;
    }

    private TestSingleton4() {

    }
}
