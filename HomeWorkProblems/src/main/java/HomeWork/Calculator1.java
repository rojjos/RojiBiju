package HomeWork;

/**
 * Created by rogi on 2/19/16.
 */
public class Calculator1 {
    public static int result;
    //public static float result1;

    public static int add(int n1,int n2){
       result = n1 + n2;
       return result;
    }
    public static int substract(int n1,int n2){
        result = n1 - n2;
        return result;
    }
    public static int multiply(int n1,int n2){
        result = n1 * n2;
        return result;
    }
    public static float divide(int n1,int n2){
      // try {
        if (n2 != 0){
            result = n1 / n2;
           }else {
       // }catch (Exception e) {
          // Calculator1.divisionByZeroException();
           System.out.println("DivisionByZeroException ");
       }
        return result;
    }

    public void divisionByZeroException(){
        System.out.println("DivisionByZeroException");
    }
   /* public static void main(String[] args) {
        Calculator1 calculator1 = new Calculator1();
        System.out.format("",calculator1.add(25,20));

    }*/
}
