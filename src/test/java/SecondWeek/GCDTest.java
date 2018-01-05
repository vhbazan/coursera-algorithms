package SecondWeek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 04/01/18.
 */
@RunWith(JUnit4.class)
public class GCDTest {

    GCD gcd = new GCD();

    @Test
    public void testBasicGDC () {
        assertEquals(5, gcd.naiveGCD(5, 10));
        assertEquals(2, gcd.naiveGCD(4, 10));
        assertEquals(234, gcd.naiveGCD(234, 234));
        assertEquals(61232, gcd.naiveGCD(183696, 61232));
    }

    @Test
    public void testImprovedGDC () {
        assertEquals(5, gcd.improvedGCD(5, 10));
        assertEquals(2, gcd.improvedGCD(4, 10));
        assertEquals(234, gcd.improvedGCD(234, 234));
        assertEquals(61232, gcd.improvedGCD(183696, 61232));
    }

    @Test
    public void testTimingGDC () {

        long startTime = System.currentTimeMillis();
        assertEquals(61232, gcd.naiveGCD(3918848, 1653264));

        long endTime   = System.currentTimeMillis();
        long totalTimeClassic = endTime - startTime;


        long startTimeImproved = System.currentTimeMillis();
        assertEquals(61232, gcd.improvedGCD(3918848, 1653264));

        long endTimeImproved   = System.currentTimeMillis();
        long totalTimeImproved = endTimeImproved - startTimeImproved;
        //Comparing processing times
        System.out.println(totalTimeClassic + " > " + totalTimeImproved);
        assertTrue(totalTimeClassic > totalTimeImproved);
    }

}