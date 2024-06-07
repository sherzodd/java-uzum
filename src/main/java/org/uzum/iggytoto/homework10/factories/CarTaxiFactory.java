package org.uzum.iggytoto.homework10.factories;

import org.uzum.iggytoto.homework10.interfaces.Driver;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.Vehicle;
import org.uzum.iggytoto.homework10.model.Car;
import org.uzum.iggytoto.homework10.model.Racer;

public class CarTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Racer();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
