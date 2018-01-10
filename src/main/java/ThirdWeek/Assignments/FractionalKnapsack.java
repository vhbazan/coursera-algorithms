package ThirdWeek.Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class FractionalKnapsack {
    public double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        double capacityDouble = (double) capacity;
        Item [] items = new Item[values.length];

        for (int i=0; i<values.length; i++) {
            Item item = new Item(weights[i], values[i]);
            items[i] = item;
        }
        System.out.println(Arrays.toString(items));

       Arrays.sort(items);

        System.out.println(Arrays.toString(items));

        //items array is descending sorted by value_per_unit

        int i = 0;

        while (i<items.length && capacityDouble>0) {
            System.out.println("capacity: " + capacityDouble);
            //fits? weight <= capacity
            if(items[i].weight <= capacityDouble) {
                value += items[i].value;
                capacityDouble = capacityDouble-items[i].weight;
            }
            else { //weight > capacity
                value += items[i].value_per_unit*capacityDouble;
                capacityDouble = capacityDouble-capacityDouble;
            }
            i++;
        }
        System.out.println("value: " + value);
        return value;
    }

    static class Item implements Comparable<Item> {

        double weight;
        double value;
        double value_per_unit;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            value_per_unit = Math.round(((double)value/(double)weight)*10000.0)/10000.0;
        }

        public String toString () {
            return "{ " + weight + ", " + value + ", " + value_per_unit + "}";
        }

        public int compareTo(Item compareItem) {
            double compareValue = compareItem.value_per_unit;
            return compareValue -this.value_per_unit>0?1:-1;
        }
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(fractionalKnapsack.getOptimalValue(capacity, values, weights));
    }
} 
