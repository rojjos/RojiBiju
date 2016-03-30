package SequenceNumbersChallenge;

/**
 * Created by rogi on 2/9/16.
 */
public class NumberTothePower {

    boolean numToThePower = false;
    public String createNumtothePower(int startRange, int endRange,int numberSeq, String numtothePow){
        if (numtothePow.equals("numToThePower")){
            numToThePower=true;
        }

        return iterateNumtothePower(startRange,endRange,numberSeq);
    }
    private String iterateNumtothePower(int startRange1, int endRange1,int numberSeq){
        String seq = "";
        //int numPow;
        for(int j =numberSeq; j>0; j--) {
            for (int i = startRange1; i < endRange1; i++) {
             seq += (int)Math.pow(j, i)+" ";
            }
        }
        return seq;
    }

}
