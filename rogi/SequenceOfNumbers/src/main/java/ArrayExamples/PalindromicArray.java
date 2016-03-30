package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class PalindromicArray {
    String[] palindramic = {"Sausage", "Eggs", "Beans", "Beans", "Eggs", "Sausage"};

    String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};

    //Reversing the Original Array elements to a String

    public String palindramicArrayDisp(String[] diffArrays) {
        String palindramicArrString = "";
        //int j=0;
        for (int i = diffArrays.length - 1, j = 0; i >= 0; i--, j++) {

            palindramicArrString += diffArrays[i] + "\n";

        }
        return palindramicArrString;
    }
}
    //**************For Testing Only******************************
   /* Checking the ARRAY is Palindrome or not
   public String[] palindramicArrayDisplay(String[] diffArrays){
        String[] palindramicArr = new String[diffArrays.length];
        int j=0;
            for (int i = diffArrays.length-1; i>=0; i--) {

                palindramicArr[j] = diffArrays[i];
                j++;
            }
        return palindramicArr;
    }*/
   /* public static void main(String[] args) {
        PalindromicArray palindromicArray = new PalindromicArray();

        System.out.println(palindromicArray.palindramic);

        System.out.println(palindromicArray.palindramicArrayDisplay(palindromicArray.palindramic));
    }*/

