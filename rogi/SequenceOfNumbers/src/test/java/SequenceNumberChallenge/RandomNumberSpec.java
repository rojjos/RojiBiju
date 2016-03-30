package SequenceNumberChallenge;

import SequenceNumbersChallenge.RandomNumbers;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Random;

/**
 * Created by rogi on 2/9/16.
 */
public class RandomNumberSpec {
    @Test
    public void randomnumSpec(){
        RandomNumbers randomNumbers = new RandomNumbers();

        String actual = randomNumbers.randomNumberGenerator(0,1);
        int realOne = Integer.parseInt(actual);
        assertTrue(realOne<11 && realOne>0);
        //assertEquals("Testing Random numbers",expected,actual);
    }
}
