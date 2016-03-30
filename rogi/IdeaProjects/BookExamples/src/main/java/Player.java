/**
 * Created by rogi on 1/16/16.
 */
public class Player {
    int number =0; // where the guess goes

    public void guess(){
        number = (int) (Math.random() *10);
        System.out.println("I am Guessing " + number);
    }
}
