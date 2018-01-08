package SecondWeek.Assignments;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 08/01/18.
 */
@RunWith(JUnit4.class)
public class FibonacciLastDigitTest {

    private FibonacciLastDigit fibonacciLastDigit = new FibonacciLastDigit();

    @Test
    public void getFibonacciLastDigitNaive() {
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitNaive(0), 0 );
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitNaive(3), 2);
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitNaive(7), 3);

    }


    @Test
    public void getFibonacciLastDigitImproved() {
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitImproved(0), 0 );
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitImproved(3), 2);
        assertEquals(fibonacciLastDigit.getFibonacciLastDigitImproved(7), 3);



    }

    @Test
    public void testPerformanceFibonacci() {

        long startTime = System.currentTimeMillis();

        assertEquals(5, fibonacciLastDigit.getFibonacciLastDigitNaive(80));
        long endTime   = System.currentTimeMillis();
        long totalTimeClassic = endTime - startTime;

        long startTimeImproved = System.currentTimeMillis();
        assertEquals(5, fibonacciLastDigit.getFibonacciLastDigitImproved(80));
        long endTimeImproved   = System.currentTimeMillis();
        long totalTimeImproved = endTimeImproved - startTimeImproved;
        //Comparing processing times
        System.out.println(totalTimeClassic + " > " + totalTimeImproved);
        assertTrue(totalTimeClassic > totalTimeImproved);

    }

}