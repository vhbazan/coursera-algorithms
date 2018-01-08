package SecondWeek.Assignments;

import java.util.*;

public class LCM {
  public long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }

  public long lcm_improved (int a , int b) {
    long gcd;
    if(a>=b){     gcd = getGCD(a, b); }
    else { gcd = getGCD(b, a); }

    return ((long)a*(long)b)/gcd;
  }

  private long getGCD(int a, int b) {
    if(b==0) {return a;}
    else {
      return getGCD(b, a%b);
    }
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    LCM lcm = new LCM();
    System.out.println(lcm.lcm_naive(a, b));
  }
}
