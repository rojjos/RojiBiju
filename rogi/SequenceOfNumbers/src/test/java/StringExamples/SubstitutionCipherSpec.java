package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class SubstitutionCipherSpec {
SubstitutionCipher substitutionCipher;
    @Before
    public void setUp(){
        substitutionCipher = new SubstitutionCipher();
    }
    @Test
    public void substitutionCipherDisplayTest(){
        String expected = "8,5,12,12,15 23,15,18,12,4";
        String actual = substitutionCipher.cipherSubstitutionDisplay(substitutionCipher.s);
        assertEquals("Testing Substitution Cipher", expected,actual);
    }




}
