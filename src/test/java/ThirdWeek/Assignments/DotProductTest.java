package ThirdWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 10/01/18.
 */
@RunWith(JUnit4.class)
public class DotProductTest {

    DotProduct dotProduct = new DotProduct();

    @Test
    public void testMaxDotProduct () {
        int [] profits = {23};
        int [] numberOfClicks = {39};
        assertEquals(897, dotProduct.maxDotProduct(profits, numberOfClicks));

        int [] profits2 = {1, 3, -5};
        int [] numberOfClicks2 = {-2, 4, 1};
        assertEquals(23, dotProduct.maxDotProduct(profits2, numberOfClicks2));
    }
}