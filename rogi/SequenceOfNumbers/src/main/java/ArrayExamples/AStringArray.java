package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class AStringArray {

    String[] breakfast = {"Sausage","Eggs","Beans","Bacon","Tomatoes","Mushrooms"};
    public String oneElementPerLine(String[] breakfast) {
        String arrayElements ="";
        for(int i = 0; i < breakfast.length; i++) {
            arrayElements += breakfast[i] +"\n";
        }
        return arrayElements;
    }
}


