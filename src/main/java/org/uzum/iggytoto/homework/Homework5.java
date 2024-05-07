package org.uzum.iggytoto.homework;

import org.uzum.iggytoto.model.Cat;

import java.lang.reflect.Field;

public class Homework5 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Cat cat = createCat();

        System.out.println("Cat's age: " + cat.getAge());
    }

    public static Cat createCat() throws NoSuchFieldException, IllegalAccessException {
        Cat cat = new Cat(0);


        Field ageField = Cat.class.getSuperclass().getDeclaredField("age");

        ageField.setAccessible(true);
        ageField.setInt(cat, 5);

        return cat;
    }

}
