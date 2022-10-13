import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        int Player1wins = 0;
        int Player2wins = 0;
        int Draws = 0;
        boolean isfinished = false;
        System.out.println("Willst du spielen? wenn ja 1 wenn nein 2");

        while (!isfinished) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            if (selection == 1) {
                for (int i = 0; i < 6; i++) {
                    int player = random.nextInt(6) + 1;
                    int ai = random.nextInt(6) + 1;

                    System.out.println("Player1:" + player + "Player2:" + ai);

                    if (player > ai) {
                        Player1wins++;
                    } else if (ai > player) {
                        Player2wins++;
                    } else {
                        Draws++;
                    }
                }
            } else if (selection == 2) {
                isfinished = true;
                System.out.println("Player1 won:" + Player1wins + " Times ");
                System.out.println("Player2 won:" + Player2wins + " Times ");
                System.out.println("Draws:" + Draws + " Times ");
            }


        }
    }
}
