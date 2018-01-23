package com.chenyu;

/**
 * builder
 *
 * @author yu_chen
 * @create 2018-01-23 17:18
 **/
public interface AirShipBuilder {

    /**
     * 构建轨道舱
     * @return
     */
    OrbitalModule buildOrbitalModule();

    /**
     * 构建引擎
     * @return
     */
    Engine builderEngine();

    /**
     * 构建逃离他
     * @return
     */
    EscapeTower builderEscapeTower();
}
