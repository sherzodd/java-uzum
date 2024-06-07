package org.uzum.iggytoto.homework10.model;

import org.uzum.iggytoto.homework10.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void move() {
        System.out.println("Легковое такси едет.");
    }
}
