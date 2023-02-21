package transport;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport (String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (model == null || model.isEmpty() || model.isBlank()) {
            System.out.println("Неверное значение");
        }
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            System.out.println("Неверное значение");
        }
        if (engineVolume <= 0) {
            System.out.println("Неверное значение");
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public abstract void startDriving();

    public abstract void finishDriving();
}
