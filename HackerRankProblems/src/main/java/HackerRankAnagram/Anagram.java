package HackerRankAnagram;
import java.io.*;
import java.util.*;

/**
 * Created by rogi on 2/21/16.
 */
public class Anagram {

        static boolean isAnagram(String A, String B) {
            //Complete the function
            boolean isAnagramTorF = false;
            if (A.length()==B.length()){
                //String stringA = A.toLowerCase();
                char[] charA = A.toLowerCase().toCharArray();
                Arrays.sort(charA);
                String sortedStringA = new String(charA);


                //String stringB = B.toLowerCase();
                char[] charB = B.toLowerCase().toCharArray();
                Arrays.sort(charB);
                String sortedStringB = new String(charB);


                if (sortedStringA.equals(sortedStringB)){
                    isAnagramTorF =true;
                }else{
                    isAnagramTorF =false;
                }
            }else{
                isAnagramTorF =false;
            }
            return isAnagramTorF;
        }
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            boolean ret=isAnagram(A,B);
            if(ret)System.out.println("Anagrams");
            else System.out.println("Not Anagrams");

        }
    }

