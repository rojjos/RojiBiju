/**
 * Created by rogi on 1/13/16.
 */
import java.util.*;

public class GreetingSpecialPeople {
    private String name;

   public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String GreetThePerson(){
        if (this.name.equals("Alice") || this.name.equals("Bob")){
            return "Good Morning " + this.name;
        }
        else {
            return "Hi " + this.name;
        }
    }
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String strN = reader.nextLine().toString();

        GreetingSpecialPeople p = new GreetingSpecialPeople();
        p.setName(strN.trim());

        System.out.print(p.GreetThePerson());
        reader.close();
    }
}







/*   String name;
    public GreetingSpecialPeople(String name) {
        this.name = name;


        if (this.name == "Alice") {
            System.out.println("Good Morning :" + this.name);
        } else if (this.name == "Bob") {
            System.out.println("Good Morning : " + this.name);
        } else {
            System.out.println("hi "+this.name);
        }
    }
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String ns  = reader.next();
        GreetingSpecialPeople speople = new GreetingSpecialPeople(ns.trim());
       // GreetingSpecialPeople speople = new GreetingSpecialPeople("Alice");

    }

}
*/