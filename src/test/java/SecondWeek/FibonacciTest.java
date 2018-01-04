package SecondWeek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 04/01/18.
 */
@RunWith(JUnit4.class)
public class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testFibonacci() {
        assertEquals(fibonacci.classicFibonacci(0), 0);
        assertEquals(fibonacci.classicFibonacci(1), 1);
        assertEquals(fibonacci.classicFibonacci(2), 1);
        assertEquals(fibonacci.classicFibonacci(3), 2);
        assertEquals(fibonacci.classicFibonacci(4), 3);
        assertEquals(fibonacci.classicFibonacci(5), 5);
        assertEquals(fibonacci.classicFibonacci(6), 8);
    }

    @Test
    public void testImprovedFibonacci() {
        assertEquals(fibonacci.improvedFibonacci(0), 0);
        assertEquals(fibonacci.improvedFibonacci(1), 1);
        assertEquals(fibonacci.improvedFibonacci(2), 1);
        assertEquals(fibonacci.improvedFibonacci(3), 2);
        assertEquals(fibonacci.improvedFibonacci(4), 3);
        assertEquals(fibonacci.improvedFibonacci(5), 5);
        assertEquals(fibonacci.improvedFibonacci(6), 8);
    }

    @Test
    public void testPerformanceFibonacci() {

        long startTime = System.currentTimeMillis();

        assertEquals(fibonacci.classicFibonacci(45), 1134903170l);
        long endTime   = System.currentTimeMillis();
        long totalTimeClassic = endTime - startTime;

        long startTimeImproved = System.currentTimeMillis();
        assertEquals(fibonacci.improvedFibonacci(45), 1134903170l);
        long endTimeImproved   = System.currentTimeMillis();
        long totalTimeImproved = endTimeImproved - startTimeImproved;
        //Comparing processing times
        System.out.println(totalTimeClassic + " > " + totalTimeImproved);
        assertTrue(totalTimeClassic > totalTimeImproved);

    }
}