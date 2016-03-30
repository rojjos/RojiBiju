import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by rogi on 2/8/16.
 */
public class SequenceGenerator {

        boolean oddNumber = false;
        boolean isLetter = false;
        //boolean isEmojis = false;

    public String createSequence(int startRange, int endRange , String oddOrAll,String numberLettersOrFaces){
        if (oddOrAll.equals("odd")){
            oddNumber = true;
        }
        if (numberLettersOrFaces.equals("letters")){
            isLetter = true;
        }
        if (numberLettersOrFaces.equals("faces"))
        {  FaceCollections emojis1 = new FaceCollections();
          //  isEmojis = true;
           emojis1.setEmojis();
           return iterateSequence(startRange,endRange,emojis1);
        }
        return iterateSequence(startRange,endRange);
    }

    private String iterateSequence(int startRange, int endRange){
        String sequence ="";

        for (int i=startRange; i <= endRange; i++) {
            if (isLetter) {
                sequence += (char) (i) + " ";}
            else {
                if (!oddNumber)
                    { sequence += i + " "; }
                else
                    {
                    if (i % 2 == 1)
                        { sequence += i + " "; }
                    }
                }

            }

        return sequence;

    }
    private String iterateSequence(int startRange, int endRange, FaceCollections emojiss){
        String sequence ="";
         for (int i=startRange; i < endRange; i++){
             if (!oddNumber)
             { sequence += emojiss.getEmojis(i) + " "; }
             else
             {
                 if (i % 2 == 1)
                 { sequence += emojiss.getEmojis(i) + " "; }
             }
         }


        return sequence;
    }

}
