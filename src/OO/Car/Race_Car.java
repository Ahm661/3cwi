package OO.Car;

public class Race_Car extends Car {
    private String wing;
    public Race_Car(int fuelConsumption, int fuelAmount, int totalFuel, Engine engine, String brand, String serialNumber, String color, String wing) {
        super(fuelConsumption, fuelAmount, totalFuel, engine, brand, serialNumber, color);
        this.wing = wing;
    }
}