package org.uzum.iggytoto.Homework5;

import org.junit.jupiter.api.Test;
import org.uzum.iggytoto.model.Cat;
import org.uzum.iggytoto.homework.Homework5;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Field;

public class HomeworkTest {


    @Test
    public void testCreateCat() throws NoSuchFieldException, IllegalAccessException {
        Cat cat = Homework5.createCat();
        Field ageField = cat.getClass().getSuperclass().getDeclaredField("age");
        ageField.setAccessible(true);

        int age = ageField.getInt(cat);

        assertEquals(5, age, "Cat's age should be 5");
    }
}