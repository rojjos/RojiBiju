package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/12/16.
 */
public class CipherDecoderSpec {
    CipherDecoder cipherDecoder;
    @Before
    public void setUp(){
        cipherDecoder = new CipherDecoder();
    }
    @Test
    public void cipherDecoderDisplayTest(){
        String expected_res = "";
        String actual_res = cipherDecoder.cipherDecoderDisplay(cipherDecoder.s);
        assertEquals("Testing Decoder"+expected_res,actual_res);
    }

}
