package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class CountLetter_e_Spec {
    CountLetter_e countLetter_e;
    @Before
    public void setUp(){
        countLetter_e = new CountLetter_e();
    }
    @Test
    public void char_E_checkingTest(){
        int expected = 3;
        int actual = countLetter_e.countLetter_e(countLetter_e.findNumberOfEs);
        assertEquals("Checking Letter e ",expected,actual);
    }


}
