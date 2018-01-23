package com.chenyu;

/**
 * @author yu_chen
 * @create 2018-01-23 17:44
 **/
public class RainAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public RainAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip createAirShip() {
        Engine engine = airShipBuilder.builderEngine();
        EscapeTower escapeTower = airShipBuilder.builderEscapeTower();
        OrbitalModule orbitalModule = airShipBuilder.buildOrbitalModule();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setEscapeTower(escapeTower);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
