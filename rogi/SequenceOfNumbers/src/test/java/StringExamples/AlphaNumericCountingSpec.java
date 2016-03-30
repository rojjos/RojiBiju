package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class AlphaNumericCountingSpec {
    AlphaNumericCounting alphaNumericCounting;
    @Before
    public void setUp(){
        alphaNumericCounting = new AlphaNumericCounting();
    }
    @Test
    public void alphaNumericCounting_Test(){
        int expected_result = 18;
        int actual_result = alphaNumericCounting.countAlphaNumerics(alphaNumericCounting.alphaNumericString);
        assertEquals("Testing Alpha Numeric counting",expected_result,actual_result);
    }

}
