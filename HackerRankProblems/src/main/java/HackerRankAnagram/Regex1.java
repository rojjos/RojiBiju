package HackerRankAnagram;
import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.PatternSyntaxException;
/**
 * Created by rogi on 2/21/16.
 */
public class Regex1 {

    public static void isValidRegex(String regex){
        boolean regexTrueOrFalse = true;
        try{
            Pattern p = Pattern.compile(regex);
        }catch (PatternSyntaxException e){
            //throw e; //return the same exception 'PatternSyntaxException'
            regexTrueOrFalse=false;
            System.out.println(e);
            System.out.println(regex);
            System.out.println(e.getDescription());
            System.out.println(e.getMessage());
            System.out.println(e.getPattern());
        }
        if (regexTrueOrFalse){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }


    }

        public static void main(String[] args){

            isValidRegex("([A-Z])(.+)");
            System.out.println("___________________________________");
            isValidRegex("[AZ[a-z](a-z)");
            System.out.println("___________________________________");
            isValidRegex("batcatpat(nat");

            /*//This is HackerRank way of solving the problem
            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String pattern = in.nextLine();
                boolean regxTrueOrFalse =true;
                try {
                    Pattern p = Pattern.compile(pattern);
                }catch (PatternSyntaxException e){
                    regxTrueOrFalse =false;
                    System.out.println();
                }
                if(regxTrueOrFalse){
                    System.out.println("Valid");
                }else {
                    System.out.println("Invalid");
                }

                testCases++;
            }*/
        }
    }

