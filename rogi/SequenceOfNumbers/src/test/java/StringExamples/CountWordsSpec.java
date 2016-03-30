package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class CountWordsSpec {
    CountWords countWords;
    @Before
    public void setUp(){
        countWords = new CountWords();
    }
    @Test
    public void countingWordsTest(){
        int expected = 5;
        int actual = countWords.wordCounter(countWords.wordsToCount);
        assertEquals("Testing Counting Word",expected,actual);
    }
}
