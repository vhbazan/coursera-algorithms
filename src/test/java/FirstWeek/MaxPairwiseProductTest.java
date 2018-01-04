package FirstWeek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by victor on 02/01/18.
 */

@RunWith(JUnit4.class)
public class MaxPairwiseProductTest {
    private MaxPairwiseProduct maxPairwiseProduct = new MaxPairwiseProduct();
    @Test
    public void testGetMaxPairwiseProduct() {

        long startTime = System.currentTimeMillis();
        int[] list3 = new int [40000];
        assertEquals(maxPairwiseProduct.getMaxPairwiseProduct(list3), 0);
        long endTime   = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        //Comparing processing times
        System.out.println(totalTime);

        startTime = System.currentTimeMillis();
        int[] list2 = new int[100000];
        assertEquals(maxPairwiseProduct.getMaxPairwiseProductImproved(list2), 0);
        endTime   = System.currentTimeMillis();
        //Comparing processing times
        totalTime = endTime - startTime;
        System.out.println(totalTime);

        int[] list4 = {-2, -1, 0};
        assertEquals(maxPairwiseProduct.getMaxPairwiseProductImproved(list4), 0);

        int[] list5 = {-2, -1, -3};
        assertEquals(maxPairwiseProduct.getMaxPairwiseProductImproved(list5), 0);
        int[] list6 = {};
        assertEquals(maxPairwiseProduct.getMaxPairwiseProductImproved(list6), 0);
    }
}
