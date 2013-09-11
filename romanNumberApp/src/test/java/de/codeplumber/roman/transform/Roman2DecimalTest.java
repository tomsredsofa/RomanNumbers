package de.codeplumber.roman.transform;

import de.codeplumber.roman.transform.Roman2Decimal;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests
 *
 * @author tom
 */
public class Roman2DecimalTest {
    private Roman2Decimal roman2Decimal;

    @Before
    public void setUp() {
        roman2Decimal = new Roman2Decimal();
    }

    @Test
    public void testTransformItoIII() throws Exception {
        assertEquals("Wrong value for 'I'", 1, roman2Decimal.transform("I"));
        assertEquals("Wrong value for 'i'", 1, roman2Decimal.transform("i"));
        assertEquals("Wrong value for 'II'", 2, roman2Decimal.transform("II"));
        assertEquals("Wrong value for 'ii'", 2, roman2Decimal.transform("ii"));
        assertEquals("Wrong value for 'III'", 3, roman2Decimal.transform("III"));
        assertEquals("Wrong value for 'iii'", 3, roman2Decimal.transform("iii"));
    }
}
