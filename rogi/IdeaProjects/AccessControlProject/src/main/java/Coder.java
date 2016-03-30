/**
 * Created by rogi on 1/21/16.
 */
public class Coder {
    //protected int val;
    protected int val =5;

    public static void main(String[] args) {

       Zip zipper = new Zip();
        zipper.print(3);

    }


}
//protected any child class can access it
//access inside the same package

class Zip{

    public void print(int s){
        Coder c = new Coder();
        System.out.println(c.val);
    }


}