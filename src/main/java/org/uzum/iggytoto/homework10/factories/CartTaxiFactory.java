package org.uzum.iggytoto.homework10.factories;

import org.uzum.iggytoto.homework10.interfaces.Driver;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.Vehicle;
import org.uzum.iggytoto.homework10.model.Cart;
import org.uzum.iggytoto.homework10.model.Coachman;

public class CartTaxiFactory implements TaxiFactory {
    @Override
    public Driver createDriver() {
        return new Coachman();
    }

    @Override
    public Vehicle createVehicle() {
        return new Cart();
    }
}
