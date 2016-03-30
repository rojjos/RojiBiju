package SequenceNumberChallenge;

import SequenceNumbersChallenge.SequenceOfNumbers;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rogi on 2/9/16.
 */
public class TestSequenceOfNumbers {
    SequenceOfNumbers sequenceOfNumbers;
    @Before
   public void setUp(){
        sequenceOfNumbers = new SequenceOfNumbers();
    }

    @Test
    public void testCreateSequence(){
    String expected = "1 2 3 4 5 6 7 8 9 10 ";
    String actual = sequenceOfNumbers.createSequence(1,11,"isNumber");
    assertEquals("Sequence of numbers",expected,actual);
    }
     @Test
    public void testPositiveOddNums(){
         String expected = "1 3 5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59 61 63 65 67 69 71 73 75 77 79 81 83 85 87 89 91 93 95 97 99 ";
         String actual = sequenceOfNumbers.createSequence(1,100,"isPositveOddNo");
         assertEquals("Testing positive odd numbers", expected,actual);

     }
    @Test
    public void testNumberToThePower(){
        String expected = "3.0 7.0 15.0 31.0 63.0 127.0 255.0 511.0 1023.0 2047.0 ";
        String actual = sequenceOfNumbers.createSequence(1,11,"isNumberToThePower");
        assertEquals("Sequence of numbers",expected,actual);
    }
    @Test
    public void testRandom(){
        String expected = "1 2 3 4 5 6 7 8 9 10";
        String actual = sequenceOfNumbers.createSequence(1,11,"isRandom");
        assertEquals("Sequence of numbers",expected,actual);
    }

}
