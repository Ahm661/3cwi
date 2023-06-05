package OO.Car;

public class Truck extends Car{
    private String trailer;
    public Truck(int fuelConsumption, int fuelAmount, int totalFuel, Engine engine, String brand, String serialNumber, String color, String trailer) {
        super(fuelConsumption, fuelAmount, totalFuel, engine, brand, serialNumber, color);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    @Override
    public void drive() {
        System.out.println("I am driving -- consumption is high");
        //super.drive();
    }
}