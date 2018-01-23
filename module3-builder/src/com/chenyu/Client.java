package com.chenyu;

/**
 * 客户端
 *
 * @author yu_chen
 * @create 2018-01-23 17:46
 **/
public class Client {

    public static void main(String[] args) {
        AirShipDirector airShipDirector = new RainAirShipDirector(new RainAirShipBuilder());

        AirShip airShip = airShipDirector.createAirShip();
    }
}
