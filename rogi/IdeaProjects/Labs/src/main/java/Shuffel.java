/**
 * Created by rogi on 1/15/16.
 */
public class Shuffel {
    public static void main(String[] args) {
        int x = 3;

        while (x >0) {
            if (x > 2) {
                System.out.print("a");
            }

            if (x == 2) {
                System.out.print("b c");
            }

            x = x - 1;
            System.out.print("-");

            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
         }
        }

    }