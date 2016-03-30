/**
 * Created by rogi on 1/17/16.
 */
public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        GoodDog three = new GoodDog();
        three.setSize(25);


        System.out.println("Dog one : " + one.getSize());
        System.out.println("Dog Two : " + two.getSize());
        System.out.println("Dog one : " + three.getSize());

        three.bark();
        one.bark();
        two.bark();
    }
}
