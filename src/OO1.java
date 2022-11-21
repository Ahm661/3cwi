import objects.car;
public class OO1 {
    public static void main(String[] args) {
        int a = 7;
        car c1 = new car();
        c1.brand = "Audi";
        c1.fuelConsumption = 7;
        c1.serialNumber = "A1234";
        car c2 = new car();
        c2.brand = "Mercedes";
        c2.fuelConsumption = 6;
        c2.serialNumber = "M1234";
        System.out.println(c1.serialNumber);
        System.out.println(c2.serialNumber);
    }
}
