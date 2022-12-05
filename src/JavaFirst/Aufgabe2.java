import java.util.Random;
// Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
// dann gib aus "Erste Zahl klein, zweite kein 50iger

public class Aufgabe2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(100);
        System.out.println(randomNumber1);

        Random random2 = new Random();
        int randomNumber2 = random.nextInt(100);
        System.out.println(randomNumber2);

        if ((randomNumber1<randomNumber2) && (randomNumber1 < 50)) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }
        if ((randomNumber1<30) || (randomNumber2 < 30)) {
            System.out.println("Eine der Beiden ist kleiner als 30");
        }

        if ((randomNumber1<50) && (randomNumber2 != 50)) {
            System.out.println("Erste Zahl klein, zweite kein 50iger");
        }
    }
}
