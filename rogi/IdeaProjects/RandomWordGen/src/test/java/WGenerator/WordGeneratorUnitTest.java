package WGenerator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rogi on 1/19/16.
 */
public class WordGeneratorUnitTest {


            @Test
            public void generateWordTest(){

                WordGenerator generator = new WordGenerator();
                char letter = (char)(Math.random()*26 + 65);
                String word = generator.generateWord(letter);
                assertTrue(word.startsWith(""+letter));


            }

    }

