/**
 * Created by rogi on 1/16/16.
 */
public class DogTestDrive {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.name = "Rover";
        System.out.println("Size: " + d.size + "\nName : " + d.name);
        d.bark();
    }

}
