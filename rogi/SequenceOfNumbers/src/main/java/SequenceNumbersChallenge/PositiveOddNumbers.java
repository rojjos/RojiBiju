package SequenceNumbersChallenge;

/**
 * Created by rogi on 2/9/16.
 */
public class PositiveOddNumbers {

    public String positiveOddnumbersCreator(int startRange, int endRange) {
        String seq="";
        for (int i = startRange; i < endRange; i++) {
            if (((i > 0) && (i < 100)) && ((i % 2) == 1)) {
                seq += i + " ";
            }
        }


        return seq;
    }
}