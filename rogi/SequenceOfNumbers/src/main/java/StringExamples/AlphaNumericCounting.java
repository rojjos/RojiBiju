package StringExamples;

import com.sun.deploy.util.StringUtils;

/**
 * Created by rogi on 2/11/16.
 */
public class AlphaNumericCounting {

    String alphaNumericString = "1984 by George Orwell.";

    public int countAlphaNumerics(String alphaNumericStg){
        int count = 0;
        for (int i=0; i < alphaNumericStg.length(); i++){
            if (!Character.isLetterOrDigit(alphaNumericStg.charAt(i))){
                count += 0;
            }else{
                count +=1;
            }
        }
        return count;
    }

}
