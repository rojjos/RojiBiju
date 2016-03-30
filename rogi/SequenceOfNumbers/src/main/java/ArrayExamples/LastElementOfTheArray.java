package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class LastElementOfTheArray extends AStringArray {

    public String lastElmOfTheArray(String[] breakfastArray) {
        String lastElement = "";
        for (int i = 0; i <= breakfastArray.length-1; i++) {
            if (breakfastArray.length-1==i) {
                lastElement = breakfastArray[i];
            }
        }
        return lastElement;
    }
}