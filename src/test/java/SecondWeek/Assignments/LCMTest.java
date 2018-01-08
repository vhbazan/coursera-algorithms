package SecondWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 08/01/18.
 */
@RunWith(JUnit4.class)
public class LCMTest {

    LCM lcm = new LCM();

    @Test
    public void testLCMNaive() {

        assertEquals(24, lcm.lcm_naive(6, 8));
        assertEquals(56, lcm.lcm_naive(8, 7));
        assertEquals(100, lcm.lcm_improved(100, 50));
        assertEquals(1933053046, lcm.lcm_naive(28851538, 1183019));

    }

    @Test
    public void testLCMImproved() {

        assertEquals(24, lcm.lcm_improved(6, 8));
        assertEquals(56, lcm.lcm_improved(8, 7));
        assertEquals(100, lcm.lcm_improved(100, 50));
        assertEquals(1933053046, lcm.lcm_improved(28851538, 1183019));

    }

    @Test
    public void testPerformanceLCM() {

        long startTime = System.currentTimeMillis();

        assertEquals(1933053046, lcm.lcm_naive(28851538, 1183019));
        long endTime   = System.currentTimeMillis();
        long totalTimeClassic = endTime - startTime;

        long startTimeImproved = System.currentTimeMillis();
        assertEquals(1933053046, lcm.lcm_improved(28851538, 1183019));
        long endTimeImproved   = System.currentTimeMillis();
        long totalTimeImproved = endTimeImproved - startTimeImproved;
        //Comparing processing times
        System.out.println(totalTimeClassic + " > " + totalTimeImproved);
        assertTrue(totalTimeClassic > totalTimeImproved);

    }

}