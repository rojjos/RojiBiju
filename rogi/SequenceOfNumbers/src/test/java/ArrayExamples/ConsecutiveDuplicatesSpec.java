package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class ConsecutiveDuplicatesSpec {
    ConsecutiveDuplicates consecutiveDuplicates;

    @Before
    public void setUp(){
        consecutiveDuplicates = new ConsecutiveDuplicates();
    }
    @Test
    public void consecutiveDuplicatesTest(){
        String expected = "1\n3\n2\n1\n4\n";
        String actual = consecutiveDuplicates.consecutiveDuplicateDisplay(consecutiveDuplicates.nums);
        assertEquals("Testing consecutive Duplicates",expected,actual);
    }

}
