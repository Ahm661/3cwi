

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Erstelle eine Zufallszahl zwischen 0 und 100
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        System.out.println(randomNumber);
        if (randomNumber<20){
            System.out.println("Mini");
        } else if (randomNumber>20 && randomNumber<50){
            System.out.println("Medium");
        } else if (randomNumber>50){
            System.out.println("Large");
        }
    }
}