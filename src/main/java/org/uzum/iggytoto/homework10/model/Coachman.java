package org.uzum.iggytoto.homework10.model;

import org.uzum.iggytoto.homework10.interfaces.Driver;

public class Coachman implements Driver {
    @Override
    public void drive() {
        System.out.println("Кучер управляет гужевой повозкой.");
    }
}
