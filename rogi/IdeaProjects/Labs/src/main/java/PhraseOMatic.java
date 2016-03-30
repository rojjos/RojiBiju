/**
 * Created by rogi on 1/15/16.
 */
public class PhraseOMatic {

    public static void main(String[] args){
        String[] WordListOne = { "24/7", "multieTirer","30,000 foot","B-toB","win-win",
                "front-end", "smart", "hello", "Good morning","six-sigma","dynamic"};

        String[] WordListTwo = { "hhhh", "vvvvvv vvvv","20,000 foot","B-toB","win-win",
                "back-end", "smartyyy", "hellooooo", "Good afternoon","six-sigmaaaa","dynamicsss","kkkk",
                  "xxxxx" ,"99999" };

        String[] WordListThree = { "63/7", "twoTirer","80,000 foot","B-toc","win-win",
                "front-end", "smarty pants", "hellooo", "Good evening",
                "six-sigmagggg","static","rrrrrr", "kkkkk" ,"hhhhh",};
        int oneLength = WordListOne.length;
        int twoLength = WordListTwo.length;
        int threeLength = WordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " "
                + WordListThree[rand3];

        System.out.println("What we need is Phrase " + phrase);

    }

    }

