package org.uzum.iggytoto.homework10;

import org.uzum.iggytoto.homework10.factories.CarTaxiFactory;
import org.uzum.iggytoto.homework10.factories.CartTaxiFactory;
import org.uzum.iggytoto.homework10.factories.MotorcycleTaxiFactory;
import org.uzum.iggytoto.homework10.factories.TruckTaxiFactory;
import org.uzum.iggytoto.homework10.interfaces.TaxiFactory;

public class Main {
    public static void main(String[] args) {
        TaxiFactory cartTaxiFactory = new CartTaxiFactory();
        TaxiOrder cartTaxiOrder = new TaxiOrder(cartTaxiFactory);
        cartTaxiOrder.startRide();

        TaxiFactory truckTaxiFactory = new TruckTaxiFactory();
        TaxiOrder truckTaxiOrder = new TaxiOrder(truckTaxiFactory);
        truckTaxiOrder.startRide();

        TaxiFactory motorcycleTaxiFactory = new MotorcycleTaxiFactory();
        TaxiOrder motorcycleTaxiOrder = new TaxiOrder(motorcycleTaxiFactory);
        motorcycleTaxiOrder.startRide();

        TaxiFactory carTaxiFactory = new CarTaxiFactory();
        TaxiOrder carTaxiOrder = new TaxiOrder(carTaxiFactory);
        carTaxiOrder.startRide();
    }
}

