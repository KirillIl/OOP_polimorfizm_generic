import driver.DriverB;
import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Vesta", 2.0);
        Car kia = new Car("KIA", "Cerato", 2.5);
        Car skoda = new Car("Skoda", "Octavia", 3.0);
        Car audi = new Car("Audi", "A3", 3.0);
        lada.printCar();
        kia.printCar();
        skoda.printCar();
        audi.printCar();


        Bus man = new Bus("MAN", "Lion’s Coach", 5.0);
        Bus gaz = new Bus("GAZ", "Вектор Next", 3.3);
        Bus maz = new Bus("MAZ", "232", 3.5);
        Bus setra = new Bus("Setra", "Provate", 3.8);
        man.printBus();
        gaz.printBus();
        maz.printBus();
        setra.printBus();


        Truck iveco = new Truck("Iveco", "MP 260E38 6x6", 12.0);
        Truck mon = new Truck("MON", "41.410 8x4", 10.0);
        Truck volvo = new Truck("VOLVO", "FMX-500-10X4", 13.0);
        Truck mercedes = new Truck("Mercedes-Benz", "Atego 815", 4.2);
        iveco.printTruck();
        mon.printTruck();
        volvo.printTruck();
        mercedes.printTruck();


        Car car = new Car("Kia", "K5", 3.0);
        DriverB driverB = new DriverB("Роман", 10,car);
        System.out.println(driverB);
    }
}