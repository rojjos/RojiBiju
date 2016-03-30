package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class Reverse_A_String {

    String stringToreverse = "I never saw a purple cow";
    public String reverse_a_StringDisplay(String revAstring){
        String reversedString="";
        for (int i=revAstring.length()-1; i >=0; i--){
           reversedString += revAstring.charAt(i);
        }
        return reversedString;
    }

}
