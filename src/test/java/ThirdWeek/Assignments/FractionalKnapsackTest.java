package ThirdWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 09/01/18.
 */
@RunWith(JUnit4.class)
public class FractionalKnapsackTest {

    private FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();

    @Test
    public void testFractionalKnapsack() {

        int [] values = {60, 100, 120};
        int [] weights = {20, 50, 30};
        assertEquals(180.0, fractionalKnapsack.getOptimalValue(50, values, weights), 0.001);

        int [] values2 = {500};
        int [] weights2 = {30};
        assertEquals(166.6667, fractionalKnapsack.getOptimalValue(10, values2, weights2), 0.001);
    }
}