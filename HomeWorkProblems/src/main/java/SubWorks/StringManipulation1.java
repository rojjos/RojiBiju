package SubWorks;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

/**
 * Created by rogi on 2/20/16.
 */
public class StringManipulation1 {


   // public class Solution {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
            Scanner scanner = new Scanner(System.in);
            String ss = "iwouldliketodivedown";   //scanner.next();
            int subStgLen = 3;  //scanner.nextInt();

           String[] stringArray = new String[9]; //{}; //ss.split("[]");

            for (int i = 0; i < ss.length(); i++) {

                for (int j = i; j < i + 3; j++) {
                    stringArray[i] += ss.charAt(j);
                }
                System.out.println(stringArray[i]);
            }

            }
        }

