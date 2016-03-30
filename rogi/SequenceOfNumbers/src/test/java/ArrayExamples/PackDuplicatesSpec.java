package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class PackDuplicatesSpec {

    PackDuplicates packDuplicates;
    @Before
    public void setUp(){
        packDuplicates = new PackDuplicates();
    }
    @Test
    public void packDuplicatesElm(){
        String expected = "aaaa, b, cc, aa, d, eee";
        String actual = packDuplicates.packDuplicateElements(packDuplicates.letters);
        assertEquals("Testing Pack Duplicates", expected,actual);
    }
}
