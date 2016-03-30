package WGenerator;
import java.util.*;

/**
 * Created by rogi on 1/19/16.
 */


import java.util.Arrays;

public class ArrayOfWords {

    private int numWords;
    private boolean sort;
    private char[] letters;
    String[] wordList;
    WordGenerator wordGenerator;
    Sort wordSorter;



    public ArrayOfWords(char[] letters, int numWords, boolean sort){
        this.numWords = numWords;
        this.letters = letters;
        this.sort = sort;
        wordGenerator = new WordGenerator();

        if(sort) {
            wordSorter = new Sort();
            wordList = generateWords(letters, numWords);
            wordList = wordSorter.sortAlphabetical(wordList);
            printWords(wordList);
        } else{
            wordList = generateWords(letters, numWords);
            System.out.println(wordList.length);
            printWords(wordList);
        }

    }


    private String[] generateWords(char[] letters, int numWords){
        String[] wordList = new String[numWords];
        letters = charToUpper(letters);

        int count=0;
        for(int i = 0; i < (int)(numWords/letters.length);i++){
            for (int j = 0; j < letters.length; j++){
                wordList[count] = wordGenerator.generateWord(letters[j]);
                count++;
            }
        }

        int remainder = wordList.length%letters.length;

        for(int i = 0; i < remainder; i++){
            wordList[count] = wordGenerator.generateWord(letters[i]);
            count++;
        }


        return wordList;
    }

    //Private method just to turn lower case letters to upper case letters
    //Because our Algorithm only works with upper case letters
    private static char[] charToUpper(char[] c){

        for(int i = 0; i<c.length;i++){
            c[i] = Character.toUpperCase(c[i]);
        }
        return c;
    }

    private void printWords(String[] words){

        System.out.println(String.join(", ",words));
    }


}


