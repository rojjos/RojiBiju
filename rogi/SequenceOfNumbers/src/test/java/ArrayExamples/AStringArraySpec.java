package ArrayExamples;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rogi on 2/10/16.
 */
public class AStringArraySpec {
    AStringArray aStringArray;
    //String[] testArray = aStringArray.breakfast;
    @Before
    public void setUp(){
        aStringArray = new AStringArray();
    }
    @Test
    public void oneElementsPerArrayTest(){

    String expectedOutput = "Sausage\nEggs\nBeans\nBacon\nTomatoes\nMushrooms\n";
    String actualOutput = aStringArray.oneElementPerLine(aStringArray.breakfast);
    assertEquals("Testing arrays", expectedOutput,actualOutput);
    }

}
