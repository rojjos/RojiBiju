import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by rogi on 1/22/16.
 */
public class App {
    Scanner prompt = new Scanner((System.in));
    private String[] startLetters;
    private String[] wordCollection;
    private int numOfWords;
    private boolean wantSorted;


    public void start(){
       // this.promptUserForSort("yes");
    startLetters = promptUserForString("enter the letters");

    numOfWords= promptUserForInt("How many words in the list");

    wantSorted = promptUserForSort("do you want to sort it? (yes/no)");
        collectionGenerator();
    }


    //ask for boolean to sort or not
    private boolean promptUserForSort(String message){
        System.out.println(message);
        if (prompt.next().toLowerCase()(equals("yes") || prompt.equals('y')))
        { return true;}
        else {
            return false;
            }
    }

    public int promptUserForInt()
    {

    }


    //ask for a string of letters
    private String promptUserForString(String message){
        System.out.println(message);

        String input =prompt.nextLine();
        String letters = "";
        for (int i =0; i< input.length(); i++) {
            if (Character.isLetter((input.charAt(i)))) {
                letters += input.charAt(i);
            }
        }
        return letters.split("");
        }


    public String[] getWordCollection(){
        return wordCollection;
    }


    private void collectionGenerator(){
       int count = 0;
        wordCollection = new String[numOfWords];
       for (int i=0; i< numOfWords; i++)
       {
           wordCollection[i] = RandomWordGenerator.makeWord(startLetters[count]);
           count++;
           if (count == startLetters.length) {
               count = 0;
           }
       }
        System.out.println(Arrays.toString(wordCollection));
        if(wantSorted) {
            Arrays.sort(wordCollection);
            System.out.println(Arrays.toString(wordCollection));
        }
    }



}
