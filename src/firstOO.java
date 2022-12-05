import OO.car;
public class firstOO {
    public static void main(String[] args) {
        int a = 7;
        car c1 = new car();
        c1.Color = "Yellow";
        c1.FuelConsumption = 7;
        c1.Seriennummer = "A1234";
        car c2 = new car();
        c2.Color = "Red";
        c2.FuelConsumption = 6;
        c2.Seriennummer = "M1234";
        c2.FuelAmount = 20;

        System.out.println(c2.FuelAmount + "Liter");
        c2.Drive();
        System.out.println(c2.FuelAmount + "Liter");
        System.out.println(c2.Geschwindigkeit + "Km/h");
        c2.Bremsen();
        System.out.println(c2.Geschwindigkeit + "KM/h");
        System.out.println("Car1: ");
        System.out.println(c1.Seriennummer);
        System.out.println(c1.Color);
        System.out.println(c1.FuelConsumption);
        System.out.println("Car2: ");
        System.out.println(c2.FuelConsumption);
        System.out.println(c2.Seriennummer);
        System.out.println(c2.Color);

    }
}
