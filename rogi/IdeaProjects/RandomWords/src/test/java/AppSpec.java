import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by rogi on 1/22/16.
 */
public class AppSpec {

    @Test
    public  void startTest(){
        App appTest = new App();
        String[] stringArray = appTest.getWordCollection();

    }
    @Test
   /* public void getterTest(){

        App appTest1 = new App();
       // String[] stringArray1 = {"saaa","sdsds","dsds","",null};// appTest1.getWordCollection();
        String[] stringArray1 = appTest1.getWordCollection();

       /* for (int i= 0; i < stringArray1.length; i++) {
            assertTrue(stringArray1[i] != null);
        }*/
    }*/


}
