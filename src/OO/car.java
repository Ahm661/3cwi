package OO;

public class car {
    public int FuelConsumption;
    public int FuelAmount;
    public String Color;
    public String Seriennummer;
    public int Geschwindigkeit;

    public void Drive (){
        this.FuelAmount = this.FuelAmount - FuelConsumption;
        this.Geschwindigkeit = 50;
        System.out.println("Ich fahre");
    }
    public void Bremsen (){
        this.Geschwindigkeit = 0;
        System.out.println("Ich Bremse");
    }
}

