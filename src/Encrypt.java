import java.util.Random;
import java.util.Scanner;


public class Encrypt {
    public static String encrypt(int letterShift, String sentenceToEncrypt) {
        String encryptedSentence = "";
        int letter = 0;

        for (int i = 0; i < sentenceToEncrypt.length(); i++) {
            letter = sentenceToEncrypt.charAt(i);

            letter += letterShift;

            if (letter > 96 && letter > 122) {
                letter = 96 + (letter - 122);
            } else if (letter > 64 && letter > 90 && letter < 96) {
                letter = 64 + (letter - 90);
            }
            String letterAsString = Character.toString(letter);
            encryptedSentence += letterAsString;
        }
        return encryptedSentence;
    }

    public static String decrypt(String sentenceToDecrypt) {

        int letter = 0;
        String decryptedSentence = "";
        boolean isProgrammRunning = true;
        int letterShift = -1;
        while (isProgrammRunning) {
            for (int i = 0; i < sentenceToDecrypt.length(); i++) {
                letter = sentenceToDecrypt.charAt(i);


                if (letter > 96 && letter > 122) {
                    letter = 96 + (letter - 122);
                } else if (letter > 64 && letter < 90) {
                    // was a Big Letter
                    letter += letterShift;
                    if (letter <= 64) {
                        letter = 91 - (65 - letter);
                    }

                }
                String letterAsString = Character.toString(letter);
                decryptedSentence += letterAsString;
            }

            System.out.println("Der Text lautet: ");
            System.out.println(sentenceToDecrypt);
            System.out.println("Entschlüsselter Text: ");
            System.out.println(decryptedSentence);
            System.out.println("Wurde der Text entschluesselt? Wenn ja (1) nein (2)");
            Scanner inputFromScanner2 = new Scanner(System.in);
            int programmEnd = inputFromScanner2.nextInt();
            if (programmEnd == 1) {
                isProgrammRunning = false;
            } else if (programmEnd == 2) {
                isProgrammRunning = true;
                decryptedSentence = "";
                letterShift = letterShift - 1;
            }

        }
        return decryptedSentence;
    }

    public static void main(String[] args) {

        boolean isProgrammRunning = true;
        String sentenceToDecrypt = " ";
        String Puffer= " ";
        int letterShiftE = 0;
        String Ausgabe = " ";

        while (isProgrammRunning)
        {
            System.out.println("Auswahlmenü:");
            System.out.println("1. Verschlüsseln (e)");
            System.out.println("2. Entschlüsseln (d)");
            System.out.println("3. Beenden (b)");
            Scanner inputFromScanner = new Scanner(System.in);
            char selectionOfUser = inputFromScanner.next().charAt(0);

            switch (selectionOfUser)
            {
                case'e':
                    System.out.println("Um wieviel soll der Text verschoben werden?");
                    letterShiftE = inputFromScanner.nextInt();
                    System.out.println("Geben Sie einen Text ein:");
                    sentenceToDecrypt = inputFromScanner.next();
                    System.out.println("Der Verschüsselte Text lautet:");
                    Ausgabe = encrypt(letterShiftE, sentenceToDecrypt);
                    System.out.println(Ausgabe);
                    break;
                case 'd':
                    System.out.println("Eingabe des zu entschluesselnden Textes: ");
                    sentenceToDecrypt = inputFromScanner.next();

                    Ausgabe = decrypt(sentenceToDecrypt);
                    System.out.println(Ausgabe);
                    break;

                case 'b':
                    System.out.println("Wird beendet ...");
                    isProgrammRunning = false;
                    break;
            }
        }
    }
}
