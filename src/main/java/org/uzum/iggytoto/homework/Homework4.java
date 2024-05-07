package org.uzum.iggytoto.homework;

import java.util.concurrent.Phaser;

public class Homework4 {
    private static final int NUMBER_OF_CARS = 5;
    private static final int TRACK_LENGTH = 500000;
    private static final Phaser START = new Phaser(NUMBER_OF_CARS + 1);

    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i <= NUMBER_OF_CARS; i++) {
            new Thread(new Car(i, (int) (Math.random() * 100 + 50))).start();
            Thread.sleep(1000);
        }

        while (START.getPhase() < 3) {
            Thread.sleep(100);
        }

        System.out.println("На старт!");
        START.arriveAndDeregister();
        Thread.sleep(1000);

        System.out.println("Внимание!");
        START.arriveAndDeregister();
        Thread.sleep(1000);

        System.out.println("Марш!");
        START.arriveAndDeregister();
    }

    public static class Car implements Runnable {
        private final int carNumber;
        private final int carSpeed;

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }

        @Override
        public void run() {
            try {
                System.out.printf("Автомобиль №%d подъехал к стартовой прямой.\n", carNumber);
                START.arriveAndAwaitAdvance();

                Thread.sleep(TRACK_LENGTH / carSpeed);

                System.out.printf("Автомобиль №%d финишировал!\n", carNumber);
            } catch (InterruptedException e) {
                System.out.printf("Автомобиль №%d не завершил гонку!\n", carNumber);
            }
        }
    }
}
