package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class CountLetter_e {

    String findNumberOfEs = "I never saw a purple cow";

    public int countLetter_e(String findNumberOfEs){
        int count =0;
        for (int i =0; i < findNumberOfEs.length(); i++){
            if ((findNumberOfEs.charAt(i)== 'e') || (findNumberOfEs.charAt(i)== 'E')){
                count += 1;
            }else{
                count +=0;
            }
        }
        return count;
    }


}
