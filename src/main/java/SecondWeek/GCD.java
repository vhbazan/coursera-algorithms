package SecondWeek;

/**
 * Created by victor on 04/01/18.
    Greatest Common Divisor
 */

public class GCD {
    private static int temp = 12;
    public long naiveGCD (long a, long b) {
       long divisor = 0l;

        for (int i= 1; i<a+b; i++) {
            if(a%i==0 && b%i==0) {
                divisor=i;
            }
        }
        return divisor;
    }
    //a > b
    public long improvedGCD(long a , long b) {
        if(b==0) {
            return a;
        }
        else {
            long aPrime = a % b;
            return improvedGCD(b, aPrime);
        }
    }

    public static void main (String args[]) {
        GCD gcd = new GCD();
        System.out.println(gcd.improvedGCD(3, 5));


    }
}
