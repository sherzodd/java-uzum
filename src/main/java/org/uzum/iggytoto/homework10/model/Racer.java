package org.uzum.iggytoto.homework10.model;

import org.uzum.iggytoto.homework10.interfaces.Driver;

public class Racer implements Driver {
    @Override
    public void drive() {
        System.out.println("Гонщик управляет легковым такси.");
    }
}