package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class ReverseArraySpec {
    ReverseArray reverseArray;
    AStringArray aStringArray;
    @Before
    public void setUp(){
        reverseArray = new ReverseArray();
        aStringArray = new AStringArray();
    }
    @Test
    public void reverseArrayTest(){
        String expected_reverseArrayElm = "Mushrooms\nTomatoes\nBacon\nBeans\nEggs\nSausage\n";
        String actual_reverseArrayElm = reverseArray.reverseArrayElm(aStringArray.breakfast);
        assertEquals("Testing Reverse Array",expected_reverseArrayElm,actual_reverseArrayElm);
    }

}
