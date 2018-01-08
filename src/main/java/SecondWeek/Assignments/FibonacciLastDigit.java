package SecondWeek.Assignments;

import java.util.*;

public class FibonacciLastDigit {
    public int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    public int getFibonacciLastDigitImproved(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;


        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current)%10;
            System.out.println(current + " ");

        }

        return current;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciLastDigit fibonacciLastDigit = new FibonacciLastDigit();
        int n = scanner.nextInt();
        int c = fibonacciLastDigit.getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

