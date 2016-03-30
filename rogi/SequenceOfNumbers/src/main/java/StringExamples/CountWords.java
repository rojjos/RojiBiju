package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class CountWords {

    String wordsToCount = "I never saw a purple cow";
    public int wordCounter(String wordString) {
        int counter = 0;

        for (int i = 0; i < wordString.length(); i++) {
            if (wordsToCount.charAt(i) == ' ') {
                counter += 1;
            } else {
                counter += 0;
            }
            }
            return counter;
        }

   /* public static void main(String[] args) {
        CountWords countWords = new CountWords();
        System.out.println(countWords.wordCounter(countWords.wordsToCount));
    }*/

}
