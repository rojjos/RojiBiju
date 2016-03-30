package DataValidatorPack;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/20/16.
 */
public class DataValidatorSpec {
    DataValidator dataValidator;

    @Before
    public void setUp(){
        dataValidator = new DataValidator();
       // boolean expected = false;
    }
    @Test
    public void isValidUsernameTest(){
        String ss1 = "agffgfgfgfgfgfgfg";
        //boolean expected = false;
        boolean actual = dataValidator.isValidUsername(ss1);
        assertFalse("Testing Username",actual);
        String ss2 = "abcdef545454ghijklmnopqrstuvwxyz";
        boolean actual1 = dataValidator.isValidUsername(ss2);
        assertFalse("Testing UserName", actual1);
        String ss3 = "abcdefghijklmnopqrstuvwxyz_121212";
        boolean actual2 = dataValidator.isValidUsername(ss3);
        assertFalse("Testing UserName", actual2);
    }

    @Test
    public void isValidEnhancedUsernameTest(){
        String string2 = "a265656gfgfg__fgfgfgfg";
        boolean actual_res = dataValidator.isValidEnhancedUsername(string2);
        assertFalse("Testing Enhanced usernames", actual_res);

    }
}
