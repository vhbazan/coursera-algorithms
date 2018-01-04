/**
 * Created by victor on 02/01/18.
 */
import java.util.Arrays;
import java.util.Random;

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
}
