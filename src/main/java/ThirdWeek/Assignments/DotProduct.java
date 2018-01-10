package ThirdWeek.Assignments;

import java.lang.reflect.Array;
import java.util.*;

public class DotProduct {
    public long maxDotProduct(int[] a, int[] b) {

        //sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);
        //their products would be the max
        long result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i] * b[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }
        DotProduct dotProduct = new DotProduct();

        System.out.println(dotProduct.maxDotProduct(a, b));
    }
}

