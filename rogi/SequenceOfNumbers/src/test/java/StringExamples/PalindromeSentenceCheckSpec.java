package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class PalindromeSentenceCheckSpec {
    PalindromeSentenceCheck palindromeSentenceCheck;
    @Before
    public void setUp(){
        palindromeSentenceCheck = new PalindromeSentenceCheck();
    }
    @Test
    public void palindromeSentenceCheckTest(){
        String expected_Pal_sentence ="risetovotesir";
        String actual_Pal_sentence = palindromeSentenceCheck.palindromeSentCheckDisplay(palindromeSentenceCheck.sentencePal_true);
        assertTrue("Palindrome sentence true case",(expected_Pal_sentence.equals(actual_Pal_sentence)));
    }
    @Test
    public void palindromeSentenceCheckTest2(){
        String expected_Pal_sentence1 ="wocelprupawasreveni";
        String actual_Pal_sentence1 = palindromeSentenceCheck.palindromeSentCheckDisplay(palindromeSentenceCheck.sentencePal_true);
        assertFalse("Palindrome sentence False case",(expected_Pal_sentence1.equals(actual_Pal_sentence1)));
    }
}
