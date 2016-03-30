package StringExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/11/16.
 */
public class PalindromeOrNotSpec {
    PalindromeOrNot palindromeOrNot,palindromeOrNot11;

    @Before
    public void setUp() {
        palindromeOrNot = new PalindromeOrNot();
        palindromeOrNot11 = new PalindromeOrNot();
    }

    @Test
   public void palindromeOrNot_Test() {
        String expected_res = palindromeOrNot.palindrome;
        String actual_res = palindromeOrNot.check_PalindromeOrNot(palindromeOrNot.palindrome);
        //assertEquals("Testing Palindrome or not",expected_res,actual_res);
        //assertTrue("Testing Palindrome or not", (expected_res.equals(actual_res)));

    }
    @Test
    public void palindromeOrNot_Test_FalseCase() {
        String expected_res1 = palindromeOrNot11.sentence;
        String actual_res1 = palindromeOrNot11.check_PalindromeOrNot(palindromeOrNot11.sentence);
        //assertEquals("Testing a sentence is plalindrome or not",expected_res1,actual_res1);
        assertFalse("Testing a sentence is plalindrome or not", (expected_res1.equals(actual_res1)));
    }
}