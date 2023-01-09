package OO;

public class Car {
    private String color;
    private int highestSpeed;
    private float fuelConsumption;
    private Engine engine;
    private Producer producer;
    private int price;
    private int range;

    public Car(String color, int highestSpeed, float fuelConsumption, Engine engine, Producer producer, int price) {
        this.color = color;
        this.highestSpeed = highestSpeed;
        this.fuelConsumption = fuelConsumption;
        this.engine = engine;
        this.producer = producer;
        this.price = price;
    }

    public float getPrice() {
        float value = this.price - (this.producer.getRabatt() * price);
        return value;
    }

    public float getFuelConsumption() {
        if (range > 50000) {
            fuelConsumption = this.fuelConsumption * 1.098f;
        }
        return fuelConsumption;
    }

    public int getDrive(int km)
    {
        this.range += this.engine.getHorsePower() * km;
        System.out.println("Driving");
        return 0;
    }
}