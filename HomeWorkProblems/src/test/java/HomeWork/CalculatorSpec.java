package HomeWork;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * Created by rogi on 2/19/16.
 */
public class CalculatorSpec {
    //Calculator1 calculator1;
   // BigDecimal bigDecimal;
    @Before
    public void setUp(){
       // calculator1 = new Calculator1();
        //BigDecimal bigDecimal;
    }
    @Test
    public void addTest(){
        int expected = 51;
        int actual = Calculator1.add(25,26);
        assertEquals("Testing the add method",expected,actual);
        //assertEquals("Testing add Method",BigDecimal.valueOf(expected),(BigDecimal.valueOf(actual)));
    }
    @Test
    public void substractTest(){
        int exp_res = 75;
        int act_res = Calculator1.substract(150,75);
        assertEquals("Testing the substract method", exp_res,act_res);
    }
    @Test
    public void multiplyTest(){
        int exp_res = 75;
        int act_res = Calculator1.multiply(25,3);
        assertEquals("Testing the Multiplication method", exp_res,act_res);
    }
    @Test
    public void divideTest(){
        int exp_res = 6;
        float act_res = Calculator1.divide(150,25);
        assertEquals("Testing the substract method", exp_res,act_res,0.0f);
    }


}
