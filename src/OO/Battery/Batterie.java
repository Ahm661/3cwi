package OO.Battery;

public class Batterie {
    public enum STATUS {ON, OF}
    private String name;
    private String color;
    private int electricityConsumption;
    private STATUS Status;


    public Batterie(int electricityConsumption) {
        this.name = name;
        this.color = color;
        this.electricityConsumption = electricityConsumption;
        STATUS status;
        this.Status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getElectricityConsumption() {
        return electricityConsumption;
    }
    public void setElectricityConsumption(int electricityConsumption) {
        this.electricityConsumption = electricityConsumption;
    }




}