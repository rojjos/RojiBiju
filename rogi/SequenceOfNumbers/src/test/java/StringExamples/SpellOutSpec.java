package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class SpellOutSpec {
    SpellOut_loud spellOut;

    @Before
    public void setUp(){
        spellOut = new SpellOut_loud();
    }
    @Test
    public void spellOutDisplayTest(){
        String expected_result = "I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W ";
        String actual_result = spellOut.spellOutDisplay(spellOut.stringToSpellOut);
        assertEquals("Testing Spell Out", expected_result,actual_result);
    }

}
