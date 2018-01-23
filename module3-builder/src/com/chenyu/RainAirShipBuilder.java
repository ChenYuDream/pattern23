package com.chenyu;

/**
 * @author yu_chen
 * @create 2018-01-23 17:43
 **/
public class RainAirShipBuilder implements AirShipBuilder {

    @Override
    public OrbitalModule buildOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule();
    }

    @Override
    public Engine builderEngine() {
        System.out.println("构建引擎");
        return new Engine();
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower();
    }
}
