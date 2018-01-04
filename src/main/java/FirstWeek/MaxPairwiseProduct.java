package FirstWeek;

import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
     public long getMaxPairwiseProduct(int[] numbers) {
        long result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if ((long)numbers[i] * (long)numbers[j] > result) {
                    result = (long)numbers[i] * (long)numbers[j];
                }
            }
        }
        return result;
    }

    public long getMaxPairwiseProductImproved (int[] numbers) {
        int n = numbers.length;
        long temp1 = 0;
        long temp2 = 0;
        for (int i = 0; i < n; ++i) {
            // 0 7 2 2 7
            if((long)numbers[i]>temp1) {
                temp2 = temp1;
                temp1 = (long)numbers[i];
            }
            else if ((long)numbers[i]>temp2) {
                temp2 = (long)numbers[i];
            }
        }
        return temp1*temp2;
    }

    public static void main(String[] args) {
        MaxPairwiseProduct maxPairwiseProduct = new MaxPairwiseProduct();
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println(maxPairwiseProduct.getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}