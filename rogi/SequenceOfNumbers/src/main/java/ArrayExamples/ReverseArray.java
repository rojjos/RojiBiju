package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class ReverseArray extends AStringArray {

    public String reverseArrayElm(String[] breakfastArray){
        String revString ="";
        for(int i = breakfastArray.length-1; i>=0; i--){
         revString += breakfastArray[i]+ "\n" ;
        }
        return revString;
    }

}
