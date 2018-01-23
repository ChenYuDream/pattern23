package com.chenyu.abstractfactory;

/**
 * 引擎
 *
 * @author yu_chen
 * @create 2018-01-22 13:49
 **/
public interface Engine {

    /**
     * 跑
     */
    void run();

    /**
     * 启动
     */
    void start();

}

/**
 * 高级引擎
 */
class LuxuryEngine implements Engine {


    @Override
    public void run() {
        System.out.println("跑的快！");
    }

    @Override
    public void start() {
        System.out.println("启动快，可自动启停");
    }
}

class LowEngine implements Engine {


    @Override
    public void run() {
        System.out.println("跑的慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }
}