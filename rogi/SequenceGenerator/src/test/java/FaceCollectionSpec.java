import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by rogi on 2/8/16.
 */
public class FaceCollectionSpec {
    FaceCollections faceCollections= new FaceCollections();
    //@Before
    //public void setUp

    @Test
    public void getEmojis(){

        faceCollections.setEmojis();

        String expected = "ʘ‿ʘ";
        String actual = faceCollections.getEmojis(0);

        Assert.assertEquals("fail if there is no emojis",expected,actual);
    }

   /* @Test
    public void testCreateSequenceFaces() {
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        String expected1 = "";
        String actual1  = sequenceGenerator.createSequence(1,25,"","faces");
        Assert.assertEquals("Number testing",expected1,actual1);
    }*/

}
