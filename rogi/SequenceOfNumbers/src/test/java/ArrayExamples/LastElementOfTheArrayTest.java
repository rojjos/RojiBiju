package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class LastElementOfTheArrayTest {
    LastElementOfTheArray lastElementOfTheArray;
    AStringArray aStringArray;
    @Before
    public void setUp(){
        lastElementOfTheArray = new LastElementOfTheArray();
        aStringArray = new AStringArray();
    }
    @Test
    public void LastElmoftheArrayTest(){
    String expectedLastElementOfTheArray = "Mushrooms";
    String actualLastElementOfTheArray = lastElementOfTheArray.lastElmOfTheArray(aStringArray.breakfast);
    assertEquals("Testing the last element of the array",expectedLastElementOfTheArray,actualLastElementOfTheArray);
    }

}
