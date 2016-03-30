package ArrayExamples;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/10/16.
 */
public class PalindromicArraySpec {
    PalindromicArray palindromicArray;
    @Before
    public void setUp(){
      palindromicArray = new PalindromicArray();
    }

    //Reversing the Original Array elements to a String and
    // checking it with Originals Array elements in a String
    @Test
    public void palindromicArrayTest(){
        String expected_ArrayString = "Sausage\nEggs\nBeans\nBeans\nEggs\nSausage\n";
        String actual_ArrayString = palindromicArray.palindramicArrayDisp(palindromicArray.palindramic);
        assertTrue("Testing Palidramic Array True or false", (expected_ArrayString.equals(actual_ArrayString)));
    }

    //Checking two Array elements are Equal or Not
    //@Test
   /* public void palindromicArrayTest(){
        String[] expected_Array = palindromicArray.palindramic;
        String[] actual_Array = palindromicArray.palindramicArrayDisplay(palindromicArray.palindramic);
        //assertArrayEquals("Testing Plaindramic Arrays",expected_Array,actual_Array);
        }*/


    }


