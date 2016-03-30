package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class PalindromeSentenceCheck {
    String sentencePal_False = "I never saw a purple cow";
    String sentencePal_true = "Rise to vote, Sir!";

    public String palindromeSentCheckDisplay(String pal_Check){
        String pal_sent_check ="";
        for (int i =pal_Check.length()-1; i>=0;i--){
         if (Character.isLetter(pal_Check.charAt(i))){
             pal_sent_check += pal_Check.toLowerCase().charAt(i);
         }

        }
        return pal_sent_check;
    }

   public static void main(String[] args) {
        PalindromeSentenceCheck palindromeSentenceCheck = new PalindromeSentenceCheck();
        System.out.println(palindromeSentenceCheck.palindromeSentCheckDisplay(palindromeSentenceCheck.sentencePal_true));
        System.out.println(palindromeSentenceCheck.palindromeSentCheckDisplay(palindromeSentenceCheck.sentencePal_False));
    }

}
