import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/8/16.
 */
public class SequenceGeneratorSpec {


    SequenceGenerator sequenceGenerator;
    @Before
    public void setUp()
    {
        sequenceGenerator = new SequenceGenerator();
    }

    @Test
   public void testCreateSequence() {
        String expected =  "a b c d e f g h i j k l m n o p q r s t u v w x y z ";
        String actual = sequenceGenerator.createSequence(97,122, "","letters");
        Assert.assertEquals("letter test method",expected,actual);
    }

    @Test
    public void testCreateSequenceOdd() {
        String expected = "1 3 5 7 9 11 13 15 17 19 21 23 25 ";
       String actual  = sequenceGenerator.createSequence(1,26, "odd","");
        Assert.assertEquals("Odd number testing",expected,actual);
    }

    @Test
    public void testCreateSequenceNumbers() {
        String expected = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 ";
        String actual  = sequenceGenerator.createSequence(1,26, "all" ,"");
        Assert.assertEquals("Number testing",expected,actual);
    }
    @Test
    public void testCreateSequenceFaces() {
        String expected1 = "(⊙_☉) ლ(=ↀωↀ=)ლ V●ᴥ●V ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ ( ⌒o⌒)人(⌒-⌒ )v ฅ(⌯͒• ɪ •⌯͒)ฅ❣ (ﾉ◕ヮ◕)ﾉ*:・ﾟ✧ (ㆁᴗㆁ✿) ｡◕‿◕｡ ⸎ (@.@)! ლ(`◉◞౪◟◉‵ლ) Ƹ̵̡Ӝ̵̨̄Ʒ （　ﾟДﾟ） (｡◕‿◕｡) ⊂(◉‿◉)つ ಠ‿ಠ ٩(͡๏̯͡๏۶ ఠ_ఠ  ٩(͡๏̯͡๏)۶ ✌(◕‿-)✌  ✿◕ ‿ ◕✿   ❀◕ ‿ ◕❀   ❁◕ ‿ ◕❁ ✌⊂(✰‿✰)つ✌ ";
        String actual1  = sequenceGenerator.createSequence(1,23,"","faces");
        Assert.assertEquals("Number testing",expected1,actual1);
    }

}
