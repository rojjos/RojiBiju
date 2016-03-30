package SequenceGenerator1;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/9/16.
 */
public class SequenceGenerator1Spec {
    SequenceGenerator1 sequenceGenerator1;
    @Before
    public void setUp(){
        sequenceGenerator1 = new SequenceGenerator1();
    }

    @Test
    public void testCreateSequence(){
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12 ";
        String actual = sequenceGenerator1.createSequence1(1,12,"all","");
        assertEquals("Number sequence test",expected,actual);

    }
    @Test
    public void testOddSequencenumbers(){
        String expected = "1 3 5 7 9 11 ";
        String actual = sequenceGenerator1.createSequence1(1,12,"odd","");
        assertEquals("Odd number testing", expected,actual);

    }
    @Test
    public void testLetterSequence(){
        String expected = "a b c d e f g h i j k l m n o p q r s t u v w x y z ";
        String actual = sequenceGenerator1.createSequence1(97, 122,"","letters" );
        assertEquals("Testing Letters",expected,actual);
    }
    @Test
    public void testEmojiSequence(){
        String expected ="(⊙_☉)ლ(=ↀωↀ=)ლV●ᴥ●Vʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ( ⌒o⌒)人(⌒-⌒ )vฅ(⌯͒• ɪ •⌯͒)ฅ❣";
        String actal = sequenceGenerator1.createSequence1(1,6,"","emojis");
        assertEquals("Emoji testing", expected,actal);

    }
}
