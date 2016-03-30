/**
 * Created by rogi on 1/14/16.
 */
import java.util.*;

public class SumOrProduct {

    public SumOrProduct() {

    }

    public static void main(String[] args)
    {
        int n;
        int sum = 0;
        int prod = 1;
         String str1;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = reader.nextInt();
        System.out.println("Enter Sum or Product you want to do : " );
        str1 = reader.next();

        if (str1.equals("Sum")) {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            System.out.print(sum);
        }
        else if(str1.equals("Prod")) {
            for (int j = 1; j <= n; j++) {
                prod *= j;
            }
            System.out.print(prod);

        }
    /*
     public int SumProduct( int x) {


    }*/
    }

}
