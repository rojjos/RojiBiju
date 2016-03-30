package SequenceNumberChallenge;

import SequenceNumbersChallenge.PositiveOddNumbers;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rogi on 2/9/16.
 */
public class PositiveOddNumbersSpec {
    PositiveOddNumbers positiveOddNumbers = new PositiveOddNumbers();
    @Test
    public void positiveOddnumbersCreatorTest(){
       String expected = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 ";
        String actual = positiveOddNumbers.positiveOddnumbersCreator(1,100);
        assertEquals("Testing Positive Odd numbers",expected,actual);
    }
}
