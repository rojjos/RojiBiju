package SequenceNumberChallenge;

import SequenceNumbersChallenge.NumberTothePower;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by rogi on 2/9/16.
 */
public class NumberTothePowerSpec {

    @Test
    public void testnumberTothePower() {
        NumberTothePower numberTothePowerSpec = new NumberTothePower();
        String expected = "3 9 27 81 243 729 2187 6561 19683 2 4 8 16 32 64 128 256 512 1 1 1 1 1 1 1 1 1 ";
        String actual = numberTothePowerSpec.createNumtothePower(1, 10, 3, "numToThePower");
        assertEquals("Testing number to the power", expected,actual);
    }
    }
