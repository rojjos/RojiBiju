package FirstExam;

/**
 * Created by rogi on 1/26/16.
 */
public class Food_Factory {
    //Write your code here
    class foodFactory extends Solution {
        //getFood() is getting a (class name) as a string called (Fastfood/Fruits)
        //food1.getclass().getName()--->in (solution class) is returning a class name (Fastfood/Friuts)
        public Food getFood(String className){
            if (className == "Fastfood"){
                //creating a new object for (Fastfood class)
                return new Fastfood();
            }else if (className == "Fruits"){
                //creating a new object for (Fruits class)
                return new Fruits();
            }
            //creating a new object for (Food class)
            return new Food();
        }
    }


    class Food extends Solution {
        void serveFood(){
            System.out.println("I'm Serving Food");
        }
    }


    class Fastfood extends Food{
        void serveFood(){
            System.out.println("I'm serving Fastfood");
        }
    }

    class Fruits extends Food{
        void serveFood(){
            System.out.println("I'm serving Fruits");
        }
    }

}
