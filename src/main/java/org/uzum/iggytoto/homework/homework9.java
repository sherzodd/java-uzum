interface Animal {
    String getName();
    String getSound();
}

class Lion implements Animal {
    @Override
    public String getName() {
        return "Lion";
    }

    @Override
    public String getSound() {
        return "Roar";
    }
}

class Mouse implements Animal {
    @Override
    public String getName() {
        return "Mouse";
    }

    @Override
    public String getSound() {
        return "Squeak";
    }
}

public class AnimalSounds {
    public static void main(String[] args) {
        List<Animal> animals = Arrays.asList(new Lion(), new Mouse());

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.getSound());
        }
    }
}
