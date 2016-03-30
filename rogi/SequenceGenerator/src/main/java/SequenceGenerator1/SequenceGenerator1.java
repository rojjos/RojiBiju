package SequenceGenerator1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rogi on 2/9/16.
 */
public class SequenceGenerator1 {

    boolean isOddNumber = false;
    boolean isLetters = false;
    boolean isEmoji =false;
    public String createSequence1(int startRange, int endRange, String oddOrAll, String numberLetersOrFaces){

        if (oddOrAll.equals("odd")){
            isOddNumber = true;
        }
        if (numberLetersOrFaces.equals("letters")){
            isLetters = true;
        }
        if (numberLetersOrFaces.equals("emojis")){
            isEmoji = true;
            setEmojis11();
           // return iterateSequence1(startRange,endRange, emojis11);
        }
        return iterateSequence1(startRange,endRange);
    }

    ArrayList<String> emojis11;
    private void createEmojis11(){

        emojis11 = new ArrayList<String>(Arrays.asList("ʘ‿ʘ","(⊙_☉)","ლ(=ↀωↀ=)ლ","V●ᴥ●V",
                "ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ","( ⌒o⌒)人(⌒-⌒ )v","ฅ(⌯͒• ɪ •⌯͒)ฅ❣"));
    }

    public void setEmojis11(){
        createEmojis11();
    }

    public String getEmojis11(int index){
        return getEmojis11(index);
    }

    private String iterateSequence1(int startRange, int endRange){
        String sequence = "";
        for (int i=startRange; i <= endRange; i++ ) {
            if (isLetters) {
                sequence += (char)(i) + " ";
            }
            else if (isEmoji){
                sequence += emojis11.get(i);
            }
            else if (!isOddNumber) {
                    sequence += i + " ";
                } else {
                    if (i % 2 == 1) {
                        sequence += i + " ";
                    }
                }

        }
        return sequence;
    }

   /* private String iterateSequence1(int startRange, int endRange, FaceCollection1 emojiss1){
        String sequence = "";


        return sequence;
    }*/

}
