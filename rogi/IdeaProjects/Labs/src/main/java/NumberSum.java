/**
 * Created by rogi on 1/13/16.
 */
import java.util.*;

public class NumberSum {
    /*public int NumberSum(int n) {
        for (int i=1; i<=2; i++){
            sum += i;
        }
        return sum;
    }
    NumberSum ns = new NumberSum();
        System.out.println(ns.NumberSum(n));
    */

    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
         n = reader.nextInt();

        for (int i=1; i<=n; i++)
        {
            sum += i;
        }

        System.out.print ("sum is :" + sum);
    }

}
