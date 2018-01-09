package SecondWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 08/01/18.
 */
@RunWith(JUnit4.class)
public class FibonacciHugeTest {
    FibonacciHuge fibonacciHuge = new FibonacciHuge();

    @Test
    public void testFibonacciHugeNaive() {
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(0, 0), 0);
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(1, 1), 1);

        assertEquals(fibonacciHuge.getFibonacciHugeNaive(3, 2), 0);
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(4, 2), 1);
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(5, 2), 1);
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(6, 2), 0);
        assertEquals(fibonacciHuge.getFibonacciHugeNaive(1, 239), 1);

    }

    @Test
    public void testImprovedFibonacciHugeImproved() {
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(0, 0), 0);
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(1, 1), 0);

        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(3, 2), 0);
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(4, 2), 1);
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(5, 2), 1);
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(6, 2), 0);
        assertEquals(fibonacciHuge.getImprovedHugeFibonacci(1, 239), 1);
    }

    @Test
    public void testPerformanceFibonacci() {

        long startTime = System.currentTimeMillis();

        assertEquals(0, fibonacciHuge.getFibonacciHugeNaive(100, 5));
        long endTime   = System.currentTimeMillis();
        long totalTimeClassic = endTime - startTime;

        long startTimeImproved = System.currentTimeMillis();
        assertEquals(0, fibonacciHuge.getImprovedHugeFibonacci(100, 5));
        long endTimeImproved   = System.currentTimeMillis();
        long totalTimeImproved = endTimeImproved - startTimeImproved;
        //Comparing processing times
        System.out.println(totalTimeClassic + " > " + totalTimeImproved);
        assertTrue(totalTimeClassic > totalTimeImproved);

    }

}