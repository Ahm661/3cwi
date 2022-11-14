import java.util.Scanner;

public class tictactoe
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input;
        char[][] spielfeld = new char[2][2];
        int reihe;
        int col;
        int playerSelection = 0;
        char symbol;
        boolean finish = false;
        boolean inputCheck = false;

        do
        {
            if (playerSelection == 0)
            {
                System.out.println("player 1:");
            }
            else
            {
                System.out.println("player 2:");
            }
            do {
                do {
                    System.out.println("Bitte gib die Zeile an");
                    input = scanner.nextLine();
                    reihe = Integer.parseInt(input);
                    reihe -= 1;
                    System.out.println(reihe);
                    if (reihe < 0 || reihe > 3) {
                        System.out.println("Bitte gib eine Zahl von 1-3 an");
                        inputCheck = true;
                    }
                }
                while (inputCheck);
                inputCheck = false;
                do {
                    System.out.println("Geben sie die Spalte an");
                    input = scanner.nextLine();
                    col = Integer.parseInt(input);
                    col -= 1;
                    if (col < 0 || col > 3) {
                        System.out.println("Geben sie eine Zahl zwischen 1 und 3 an");
                        inputCheck = true;
                    }
                }
                while (inputCheck);
                if (spielfeld[reihe][col] == 'X'||spielfeld[reihe][col] == 'O')
                {
                    inputCheck = true;
                    System.out.println("Spiel Richtig das Feld ist voll!");
                }
            }
            while (inputCheck);

            if (playerSelection == 0)
            {
                playerSelection = 1;
                symbol = 'X';
            }
            else
            {
                playerSelection = 0;
                symbol = 'O';
            }

            spielfeld[reihe][col] = symbol;

            for (int r = 0; r < 3; r++)
            {
                for (int c = 0; c < 3; c++)
                {
                    try
                    {
                        System.out.println(spielfeld[r][c]);
                    }
                    finally
                    {
                        System.out.println(" ");
                    }

                }
                System.out.println();
            }
            finish = F_finish();
        }
        while (!finish);
    }
    public static boolean F_finish()
    {
        boolean finish = false;
        return finish;
    }

}