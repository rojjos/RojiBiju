package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class LastbutOneElmArraySpec {
    LastbutOneElmArray lastbutOneElmArray;
    AStringArray aStringArray;
    @Before
    public void setUp(){
        lastbutOneElmArray = new LastbutOneElmArray();
        aStringArray = new AStringArray();
    }
    @Test
    public void lastbutOneElmArrayTest(){
        String expected_LastButOneElm = "Tomatoes";
        String actual_LastButOneElm = lastbutOneElmArray.lastButOneElement(aStringArray.breakfast);
        assertEquals("Testing last but one Element of the array",expected_LastButOneElm,actual_LastButOneElm);

    }

}
