package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class RemoveVowelsSpec {
    RemoveVowels removeVowels;
    @Before
    public void setUp(){
        removeVowels = new RemoveVowels();
    }
    @Test
    public void removeVowelsTest(){
        String expected_res = "* n*v*r s*w * p*rpl* c*w";
        String actual_res = removeVowels.vowelsToAsteriskMethod(removeVowels.stringToRemoveVowels);
        assertEquals("Testing Remove vowels",expected_res,actual_res);
    }

}
