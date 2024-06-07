package org.uzum.iggytoto.homework10;

import org.uzum.iggytoto.homework10.interfaces.Driver;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.Vehicle;

public class TaxiOrder {
    private Driver driver;
    private Vehicle vehicle;

    public TaxiOrder(TaxiFactory factory) {
        this.driver = factory.createDriver();
        this.vehicle = factory.createVehicle();
    }

    public void startRide() {
        driver.drive();
        vehicle.move();
    }
}