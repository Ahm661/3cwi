import java.util.Scanner;

public class Bankautomat {
    public static void main(String[] args) {
        boolean isFinished = false;
        int balance = 0;
        System.out.println("Wählen sie die gewünschte Funktion:");
        System.out.println("    1. Einzahlen");
        System.out.println("    2. Abheben");
        System.out.println("    3. Kontostand");
        System.out.println("    4. Ende");
        while (!isFinished) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();

            if (selection == 1) {
                System.out.println("Wie viel möchten sie einzahlen");
                int deposit = scanner.nextInt();

                balance = balance + deposit;
                System.out.println("Sie haben " + deposit + "€ eingezahlt");
            }
            if (selection == 2) {
                System.out.println("Wieviel würden sie gerne abheben?");
                int withdraw = scanner.nextInt();
                balance = balance - withdraw;
                System.out.println("Sie haben " + withdraw + "€ abgehoben!");
            }
            if (selection == 3) {
                System.out.println("Ihr Kontostand beträgt:" + balance + "€");
            }

            if (selection == 4) {
                isFinished = true;
                System.out.println("Danke das sie unsere Maschnine benutzt haben");
            }
        }
    }
}
