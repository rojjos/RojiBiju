package StringLab;

/**
 * Created by rogi on 2/20/16.
 */
public class MyStringUtils {
    static String charsInaString = "a b c d e f g h i j k l m n o p  q r s t u  v w x y z";


    public static String charactersToString(String str1){
        String charactersToStg ="";
        for(int i=0; i < str1.length(); i++){
            if (charactersToStg.length() <= 0){
                charactersToStg += str1.charAt(i);
            }else if (Character.isLetter(str1.charAt(i)))
            {
                charactersToStg += str1.charAt(i);
            }

        }
        return charactersToStg;
    }

    static String wordsInAString = "Have,a,nice,day,everyone";

    public static String arrayOfString(String wordString){
        String wordsToString="";
       String[] wordsToStringArray =wordString.split(",");
        int ss = wordsToStringArray.length;
        for (int j=0; j< ss; j++){
            wordsToString +=wordsToStringArray[j]+"\n";
        }
        return wordsToString;
        }

    static String removeWhiteSpace = "God is Love";

    public static String removingWhteSpace(String str){
        String whiteSpaceREmoved = "";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(charsInaString)=="\\s")) {
                whiteSpaceREmoved += "\n";
            }else{
                whiteSpaceREmoved += str.charAt(i);
                }
            }

        return whiteSpaceREmoved;

    }



    public static void main(String[] args) {
        System.out.println(charactersToString(charsInaString));

        System.out.println(arrayOfString(wordsInAString));

        System.out.println(removingWhteSpace(removeWhiteSpace));
    }
}
