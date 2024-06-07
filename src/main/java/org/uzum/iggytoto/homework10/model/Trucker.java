package org.uzum.iggytoto.homework10.model;

import org.uzum.iggytoto.homework10.interfaces.Driver;

public class Trucker implements Driver {
    @Override
    public void drive() {
        System.out.println("Дальнобойщик управляет грузовым такси.");
    }
}