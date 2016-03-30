import static org.junit.Assert.assertEquals;

import org.junit.Test;


/**
 * Created by rogi on 1/23/16.
 */
public class TimeLineSpec {

        @Test
        public void setFetchCount() {
            Timeline timeline = new Timeline();
            int expected = 5;

            timeline.setFetchCount( expected );
            int actual = timeline.getFetchCount();

            assertEquals( expected, actual );
        }
    }




