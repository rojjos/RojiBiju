package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class PalindromeOrNot {
    String sentence = "I never saw a purple cow";
    String palindrome = "rotavator";

    public String check_PalindromeOrNot(String palindromeCheckString){
        String palindromeOrNotReturn ="";
        for(int i = palindromeCheckString.length()-1; i>=0; i--)
        {
            palindromeOrNotReturn += palindromeCheckString.charAt(i);
        }
        return palindromeOrNotReturn;
    }

}
