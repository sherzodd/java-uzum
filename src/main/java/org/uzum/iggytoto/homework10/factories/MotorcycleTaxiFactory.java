package org.uzum.iggytoto.homework10.factories;

import org.uzum.iggytoto.homework10.interfaces.Driver;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.Vehicle;
import org.uzum.iggytoto.homework10.model.Biker;
import org.uzum.iggytoto.homework10.model.Motorcycle;

public class MotorcycleTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Biker();
    }

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}