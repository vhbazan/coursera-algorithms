package SecondWeek;

/**
 * Created by victor on 04/01/18.
 */
public class Fibonacci {

    public long classicFibonacci(int n) {
        if (n<=1) {
            return n;
        }
        else return classicFibonacci(n-1) + classicFibonacci(n - 2);
    }

    public long improvedFibonacci(int n) {
        long[] fibonacciArray = new long [n+1];

        for(int i=0; i<=n; i++) {
            if(i<=1) fibonacciArray[i] = i;
            else {
                fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
            }
        }
        return fibonacciArray[n];

    }

}
