package StringLab;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/20/16.
 */
public class MyStringUtilsSpec {
    MyStringUtils myStringUtils;
    @Before
    public void setUp(){
        myStringUtils = new MyStringUtils();
    }
    @Test
    public void charactersToStringTest(){
        String expected = "abcdefghijklmnopqrstuvwxyz";
        String actual = MyStringUtils.charactersToString(expected);
        assertEquals("Testing characters To String",expected,actual);
    }
    @Test
    public void arrayOfString(){
        String exp_res = "Have\na\nnice\nday\neveryone\n";
        String act_res = MyStringUtils.arrayOfString(MyStringUtils.wordsInAString);
        assertEquals("Testing array of Strings",exp_res,act_res);
    }

}
