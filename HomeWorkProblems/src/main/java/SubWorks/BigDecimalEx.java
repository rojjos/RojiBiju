package SubWorks;
import java.math.BigDecimal; //do not forget the import statement
/**
 * Created by rogi on 2/19/16.
 */
public class BigDecimalEx {


   // public class BigDecimalExample3 {
        public static void main(String[]args){

                BigDecimal a = new BigDecimal("8.8");
                BigDecimal b = new BigDecimal("2.200");
                BigDecimal c = new BigDecimal("-2");

   // try {
            System.out.println(a.divide(b));
   // }catch (ArithmeticException e){throw e;}
            System.out.println(a.subtract(b));
            System.out.println(a.multiply(b));
            System.out.println(a.add(b)); //0
            System.out.println("a compared to c = "+a.compareTo(c)); //1
            System.out.println("b compared to a = "+b.compareTo(a)); //0
            System.out.println("b compared to c = "+b.compareTo(c)); //1
            System.out.println("c compared to a = "+c.compareTo(a)); //-1
            System.out.println("c compared to b = "+c.compareTo(b)); //-1

        }
   // }
}
