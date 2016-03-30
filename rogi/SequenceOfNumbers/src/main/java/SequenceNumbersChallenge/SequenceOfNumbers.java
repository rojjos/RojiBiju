package SequenceNumbersChallenge;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by rogi on 2/9/16.
 */
public class SequenceOfNumbers {
 boolean isNumber = false;
 boolean isPositiveOddNum = false;
 boolean isNumberToThePower =false;
 boolean isRandom =false;

    public String createSequence(int startRange, int endRange, String numOrPositiveOddOrNumToThePower)
    {
        if(numOrPositiveOddOrNumToThePower.equals("isNumber")){
            isNumber = true;
        }
        else if (numOrPositiveOddOrNumToThePower.equals("isPositveOddNo")){
            isPositiveOddNum = true;
        }
        else if (numOrPositiveOddOrNumToThePower.equals("isNumberToThePower")){
            isNumberToThePower = true;
        }else if(numOrPositiveOddOrNumToThePower.equals("isRandom"))
        {isRandom = true;}
        return iterateSequence(startRange,endRange);
    }

    private String iterateSequence(int startRange1,int endRange1){
        String sequence = "";
        double noToThePow = 1;
        Integer num = 2;

        for(Integer i = startRange1; i < endRange1; i++){
            //int x = i
           if (isNumber) {
               sequence += i +" ";
           }else if(isPositiveOddNum){
               if (((i > 0) && (i < 100)) && ((i % 2)==1)){
                   sequence += i + " ";
               }
           }else if(isNumberToThePower){
               noToThePow += Math.pow(num,i);
               sequence += noToThePow + " ";
           }else if(isRandom){
               Random rand = new Random();

               sequence += (int)rand.nextInt(10)+1+" ";

           }


        }
        return sequence;
    }


    }





