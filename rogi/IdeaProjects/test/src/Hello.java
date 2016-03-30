import java.util.Scanner;
import java.util.*;
/**
 * Created by rogi on 1/13/16.
 */
public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int s = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a string : ");
        String ss = sc.nextLine();
       // ss.equals("jhjhjhjhj ghghg");
        String value = String.format( "%1$-15s %2$03d", ss,s);
        //System.out.format("%-16s", ss + "%03d%n",s);
        System.out.println(value);
        String value1="";
        System.out.println("================================");

        /*for(int i=0;i<3;i++)
        {    //String value1;
            String s1=sc.next();
            int x=sc.nextInt();
            value1 = String.format( "%1$-16s %2$03d", s1,x);
        }
        System.out.println(value1);
        System.out.println("================================");
*/

    }




    /*
    int num;
    char somestring;


    public static void main(String[] arg)
    {

        Hello v = new Hello();

        System.out.println(v.num);
        System.out.println(v.somestring);

    }*/

}
