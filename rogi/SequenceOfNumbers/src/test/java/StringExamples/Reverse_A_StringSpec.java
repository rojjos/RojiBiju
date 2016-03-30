package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class Reverse_A_StringSpec {
    Reverse_A_String reverse_a_string;
    @Before
    public void setUp(){
        reverse_a_string = new Reverse_A_String();
    }
    @Test
    public void reverse_a_stringTest(){
        String expected_result = "woc elprup a was reven I";
        String actual_result = reverse_a_string.reverse_a_StringDisplay(reverse_a_string.stringToreverse);
        assertEquals("Testing reversing a string",expected_result,actual_result);
    }
}
