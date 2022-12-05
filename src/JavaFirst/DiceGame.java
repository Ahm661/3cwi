import java.util.Random;
import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int player1Wins = 0;
        int player2Wins = 0;
        int draws = 0;
        boolean isFinished = false;
        System.out.println("Spiel Starten 1 " +
                            "Spiel Beenden 2");

        while (!isFinished) {

            int selection = scanner.nextInt();
            if (selection == 1) {
                for (int i = 0; i < 6; i++) {
                    int player = random.nextInt(6) + 1;
                    int ai = random.nextInt(6) + 1;

                    System.out.println("Player1:" + player + "Player2:" + ai);

                    if (player > ai) {
                        player1Wins++;
                    } else if (ai > player) {
                        player2Wins++;
                    } else {
                        draws++;
                    }
                }
            } else if (selection == 2) {
                isFinished = true;
                System.out.println("Player1 won:" + player1Wins + " Times ");
                System.out.println("Player2 won:" + player2Wins + " Times ");
                System.out.println("Draws:" + draws + " Times ");
            }


        }
    }
}
