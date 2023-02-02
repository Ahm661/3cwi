package JavaFirst;

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String uppers = "";
        String lowers = "";
        for(char c: t.toCharArray())
        {
            if(Character.isUpperCase(c))
            {
                uppers += c;

            }
            else
            {
                lowers += c;
            }

        }

        System.out.println(uppers);
        System.out.println(lowers);
    }

}
