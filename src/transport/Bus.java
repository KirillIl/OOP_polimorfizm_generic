package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startDriving() {
        System.out.printf("Автобус %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void finishDriving() {
        System.out.printf("Автобус %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автобус!  %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int bestLapTime() {return ThreadLocalRandom.current().nextInt(1, 15);
    }

    @Override
    public int maximumSpeed() { return ThreadLocalRandom.current().nextInt(1, 300);
    }

    public void printBus() {
        System.out.println("Автобус: " + getBrand()+
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }
}
