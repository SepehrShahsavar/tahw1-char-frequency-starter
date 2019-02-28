package ir.ac.kntu;

import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        // write your logic here
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine().trim();
        String[] splited = phrase.split("\\s+");
        String  str = String.join("", splited); 
        String finalString = str.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            int counter = 0;
            for (int j = 0; j < finalString.length(); j++) {
                if (finalString.charAt(j) == i) {
                    counter++;
                }
            }
            if (counter > 0) {
                System.out.println(i + " : " + counter);
            }
        }
        input.close();
    }
}
