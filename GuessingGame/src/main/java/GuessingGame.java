import java.util.*;
/**
 * Created by rogi on 1/18/16.
 */
public class GuessingGame {
    private int secretNumber; // Secret Number - random generated.
    private int numberOfAttempts;

    public void StartGame() {
        //double rand = Math.random();
        //System.out.println(rand);

        this.secretNumber = (int) (100 * Math.random()); // Step1 and Step2
        System.out.println("I have a secret number!!!");
        System.out.println("Want to take a guess? (Clue: Its between 0 - 100)");

        this.numberOfAttempts = 1;
        Scanner n = new Scanner(System.in);
        while (ProcessGuessedNumber(n.nextInt()) != 0) { // Step3
            System.out.print("Guess again? ");
            this.numberOfAttempts++;
        }
    }

    private int ProcessGuessedNumber(int guessedNumber) { // Step4

        if (this.secretNumber == guessedNumber) { // Step5
            System.out.println("Correct Guess!");
            System.out.println("Number of attempts: " + this.numberOfAttempts);

            return 0;
        } else if (this.secretNumber > guessedNumber) { // Step6
            System.out.println("Guessed number too small!");
            return -1;
        } else if (this.secretNumber < guessedNumber) { // Step7
            System.out.println("Guessed number too big!");
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.StartGame();
    }
}

