import org.junit.Test;
import static org.junit.Assert.*;

public class SpecArrayOfWord {

    @Test
    public void testSort(){
        String[] startArray = {"A","C","B"};
        String[] expectedReturnArray = {"A", "B", "C"};

        ArrayOfWords arrayOfWords = new ArrayOfWords();

        String[] resultArray = arrayOfWords.sort(startArray);
       assertArrayEquals("Assert that arrays are equal", expectedReturnArray, resultArray);
        //assertArrayEquals("Assert that arrays are equal", startArray, resultArray);

    }
}
