package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    @Override
    public void startDriving() {
        System.out.printf("Грузовик %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void finishDriving() {
        System.out.printf("Грузовик %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }
    @Override
    public void pitStop () {
        System.out.printf("Грузовик! %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }


    @Override
    public int bestLapTime () {return ThreadLocalRandom.current().nextInt(1, 20);
    }

    @Override
    public int maximumSpeed () {return ThreadLocalRandom.current().nextInt(1, 250);
    }

    public void printTruck () {
        System.out.println("Грузовик: " + getBrand() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }
}
