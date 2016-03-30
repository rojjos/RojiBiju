package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class RemoveVowels {

    String stringToRemoveVowels = "I never saw a purple cow";

    public String vowelsToAsteriskMethod(String vowelstoAsterisk){
        String vowelsToAsterisksString = "";
        String vowelToAst_lowercase = vowelstoAsterisk.toLowerCase();

        for (int i = 0; i < vowelstoAsterisk.length(); i++){
            //((findNumberOfEs.charAt(i)== 'e') || (findNumberOfEs.charAt(i)== 'E'))
            if (vowelToAst_lowercase.charAt(i) =='a' || vowelToAst_lowercase.charAt(i) =='A'||
                vowelToAst_lowercase.charAt(i) =='e' || vowelToAst_lowercase.charAt(i) =='E'||
                vowelToAst_lowercase.charAt(i) =='i' || vowelToAst_lowercase.charAt(i) =='I'||
                vowelToAst_lowercase.charAt(i) =='o' || vowelToAst_lowercase.charAt(i) =='O'||
                vowelToAst_lowercase.charAt(i) =='u' || vowelToAst_lowercase.charAt(i) =='U')
            {

                vowelsToAsterisksString += "*";
            } else{
                vowelsToAsterisksString += vowelstoAsterisk.charAt(i);
            }
        }

        return vowelsToAsterisksString;
    }
/*
    public static void main(String[] args) {
        RemoveVowels removeVowels = new RemoveVowels();
        System.out.println(removeVowels.vowelsToAsteriskMethod(removeVowels.stringToRemoveVowels));
    }*/

}
