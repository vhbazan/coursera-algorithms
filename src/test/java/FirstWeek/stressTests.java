package FirstWeek; /**
 * Created by victor on 02/01/18.
 */
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class stressTests {

    public static void main (String args[]) {
        while(true) {
            int n = (int)(Math.random()*1000) + 2;

            System.out.println(n);
            int[] list = new int[n];
            for (int i=0; i<n; i++) {
                list[i] = (int)(Math.random()*100000);
            }

            System.out.println(Arrays.toString(list));

            MaxPairwiseProduct maxPairwiseProduct = new MaxPairwiseProduct();

            long result1 = maxPairwiseProduct.getMaxPairwiseProduct(list);
            long result2 = maxPairwiseProduct.getMaxPairwiseProductImproved(list);
            if(result1!=result2) {
                System.out.println("Wrong answer: " + result1 + " " + result2);
                break;
            }
            else {
                System.out.println("Ok");
            }
        }
    }

    /**
     * Created by victor on 02/01/18.
     */

    @RunWith(JUnit4.class)
    public static class MaxPairwiseProductTest {
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
}
