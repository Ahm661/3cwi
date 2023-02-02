package JavaFirst;

import java.util.Scanner;

public class LetterFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie einen Text ein: ");
        String input = sc.nextLine();
        String upperCase = "";
        String lowerCase = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCase += c;
            } else if (Character.isLowerCase(c)) {
                lowerCase += c;
            }
        }

        System.out.println(upperCase);
        System.out.println(lowerCase);
    }
}