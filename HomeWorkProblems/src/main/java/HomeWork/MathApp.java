package HomeWork;

import java.math.BigDecimal;

/**
 * Created by rogi on 2/19/16.
 */
public class MathApp {

   public static void main(String[] args) {
       System.out.println(Calculator1.add(75,35));
       System.out.println(Calculator1.add(750,37));
       System.out.println();
       System.out.println(Calculator1.substract(65,85));
       System.out.println(Calculator1.substract(65,8));
       System.out.println();
       System.out.println(Calculator1.multiply(12,27));
       System.out.println(Calculator1.multiply(65,85));
       System.out.println();
       System.out.println(Calculator1.divide(65,12));
       try {
           System.out.println(Calculator1.divide(6, 0));
       }catch (ArithmeticException e){
           System.out.println("Divisible by zero is not possible");
       }
    }
}
