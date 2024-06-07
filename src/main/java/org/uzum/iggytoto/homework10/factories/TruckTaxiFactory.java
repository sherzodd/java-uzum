package org.uzum.iggytoto.homework10.factories;

import org.uzum.iggytoto.homework10.interfaces.Driver;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.Vehicle;
import org.uzum.iggytoto.homework10.model.Truck;
import org.uzum.iggytoto.homework10.model.Trucker;

public class TruckTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Trucker();
    }

    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
