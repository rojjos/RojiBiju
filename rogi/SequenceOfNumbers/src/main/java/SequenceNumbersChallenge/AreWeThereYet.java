package SequenceNumbersChallenge;

import java.util.Scanner;

/**
 * Created by rogi on 2/9/16.
 */
public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we there yet? ");
        boolean testTorF = false;
        String yesOrNo = scanner.next();

        while (!testTorF) {
            if (yesOrNo.equals("yes")) {
                testTorF = true;
                System.out.println("Good");
            } else {
                testTorF = false;
                System.out.println("Are we there yet? ");
                yesOrNo = scanner.next();
            }
        }
    }
}