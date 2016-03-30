package SequenceNumbersChallenge;

import java.util.Random;

/**
 * Created by rogi on 2/9/16.
 */
public class RandomNumbers {

    public String randomNumberGenerator(int startRange, int endRange){
        String randnumbers = "";
        Random rn = new Random();
        for (int i =startRange; i<endRange; i++)
        {
            randnumbers  += rn.nextInt(10)+1 +"";

        }
        return randnumbers;
    }

}
