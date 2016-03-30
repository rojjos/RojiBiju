/**
 * Created by rogi on 1/17/16.
 */
public class DogDog {
    String name;
    public static void main(String[] arg){

        //make a Dog Object and access it
        DogDog dog1 = new DogDog();
        dog1.bark();
        dog1.name = "Bart";

        // now make a Dog array
        DogDog[] myDogs = new DogDog[3];

        // and puts some dogs in it
        myDogs[0] = new DogDog();
        myDogs[1] = new DogDog();
        myDogs[2] = dog1;

        //now access the dogs using array
        //references
        myDogs[0].name ="Fred";
        myDogs[1].name ="Marge";
         System.out.print("last dogs name is: ");
        System.out.println(myDogs[2].name);

        //now loop through the array and
        // tell all the dogs to bark
        int x=0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x=x+1;
        }

    }
     public void bark(){
         System.out.println(name + " says Ruff!");
     }
    public void eat() { }
    public void chaseCat() { }
}
