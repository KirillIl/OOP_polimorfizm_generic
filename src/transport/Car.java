package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Car extends  Transport implements Competing{
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startDriving() {
        System.out.printf("Автомобиль %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }
    public void finishDriving() {
        System.out.printf("Автомобиль %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public void pitStop() {
        System.out.printf("Автомобиль %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }

    @Override
    public int bestLapTime() {return ThreadLocalRandom.current().nextInt(1, 10);
    }

    @Override
    public int maximumSpeed() {return  ThreadLocalRandom.current().nextInt(1,400);
    }

    public void printCar() {
        System.out.println("Легковой автомобиль: " + getBrand()+
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");

    }
}
