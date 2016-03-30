import java.util.Random;

/**
 * Created by rogi on 1/21/16.
 */
public class RandomWordGenerator {

     //RandomWordGenerator(char input){


    public static String makeWord(String input){

             String word = input;
             Random rand = new Random();

             int wordLength = rand.nextInt(10);

             for(int i=1; i< wordLength; i++) {
                 word += (char) (rand.nextInt(26) + 97);

             }
             return word;

    }


}
