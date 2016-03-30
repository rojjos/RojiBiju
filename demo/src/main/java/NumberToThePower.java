/**
 * Created by rogi on 2/8/16.
 */
public class NumberToThePower {
    public String makeWord(){

        String word="";
        //Random rand = new Random();
        //int wordLength = rand.nextInt(10);

        for (int i = 97; i <= 122; i++) {

            word += (char)(i)+ " ";
        }

        return word;
    }



    public String numToThePower(){
        String numToThePow="";
        int noToThePow = 1;
        int num = 2;

        for (int i = 0; i <11; i++ ){
            noToThePow += Math.pow(num,i);
            numToThePow += noToThePow +" ";

        }

        return numToThePow;
    }

    public static void main(String[] args) {
        NumberToThePower d = new NumberToThePower();
        //System.out.println(d.makeWord());
        System.out.println(d.numToThePower());

    }

}
