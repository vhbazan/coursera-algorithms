package ThirdWeek.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Change {
    public int getChange(int m) {
        int coinValues[] = {10, 5, 1};

        int numberOfCoins[] = new int[coinValues.length];
        int remaining = m;
        //the greedy algorithm will first choose the greatest value coin and then 
        //it will point to the second greatest 
        for (int i = 0; i < coinValues.length; i++) {
            if (remaining / coinValues[i] > 0) {
                numberOfCoins[i] = remaining / coinValues[i];
                remaining = remaining % coinValues[i];
            }
        }
        System.out.println(Arrays.toString(numberOfCoins));
        return numberOfCoins[0] + numberOfCoins[1] + numberOfCoins[2];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        Change change = new Change();
        System.out.println(change.getChange(m));
    }
}
