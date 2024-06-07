package org.uzum.iggytoto.homework10.model;

import org.uzum.iggytoto.homework10.interfaces.Vehicle;

public class Motorcycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Мотоцикл мчит.");
    }
}
