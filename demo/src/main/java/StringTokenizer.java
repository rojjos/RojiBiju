import java.util.StringTokenizer;

/**
 * Created by rogi on 2/9/16.
 */

public class StringTokenizer {
    public static void main(String[] args) {

        String str = "I am sample string and will be tokenized on space";
        StringTokenizer defaultTokenizer = new StringTokenizer(str);
        System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());
        while (defaultTokenizer.hasMoreTokens()) {
            System.out.println(defaultTokenizer.nextToken());
        }
        System.out.println("Total number of tokens found : " + defaultTokenizer.countTokens());
    }
}
