package io.zipcoder;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
/**
 * Created by rogi on 1/21/16.
 */
public class LoopSpec {
    private Loop loop;

    @Before
    public void staging(){
        loop = new Loop();
    }

    @Test
    public void getlettersTest(){
        String[] letters = loop.getLetters();
        assertNotNull(letters);

    }

}
