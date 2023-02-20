package OO;
public class Car {
    // Instanz /Gedächtnis
    private int fuelConsumption;
    private int fuelAmount;
    private int totalFuel;
    private Engine engine;
    private String brand;
    private String serialNumber;
    private String color;

    public Car(int fuelConsumption, int fuelAmount, int totalFuel, Engine engine, String brand, String serialNumber, String color) {
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.totalFuel = totalFuel;
        this.engine = engine;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
    }


    //Methode
    public void info(){
        System.out.println("Ich bin ein "+ this.brand + " habe die Farbe " + this.color + " und habe " + this.getEngine().getHorsePower() + "ps");
    }
    public void drive() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        if (fuelAmount >= fuelConsumption)
            System.out.println("I am driving");
    }
    public void break2() {
        System.out.println("Ich bremse aus");
    }

    public void turboBoost() {
        if (fuelAmount > totalFuel * 0.1)
            System.out.println("SuperBoostMode");
        else
            System.out.println("Not enough fuel to go to SuperBoost");
    }

    public void honk(int amountOfRepetitions) {
        //for(int i = 0; i < 10; i++)
        for (int i = amountOfRepetitions; i > 0; i--)
            System.out.println("Tuuut");
    }

    public void getRemainingRange() {
        // fuelConsumption, fuelAmount
        double result = fuelAmount / (double) fuelConsumption;
        System.out.println(result);
        if (result < 1)
            System.out.println("Du solltest tanken!!");
    }

    public void setTank (int tank){
        fuelAmount = tank;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColor(String color){
        this.color = color;
    }
    public void setFuelAmount(int fuelAmount){
        this.fuelAmount = fuelAmount;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setTotalFuel(int totalFuel) {
        this.totalFuel = totalFuel;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTotalFuel() {
        return totalFuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

}}