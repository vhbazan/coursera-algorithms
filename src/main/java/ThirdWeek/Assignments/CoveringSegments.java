package ThirdWeek.Assignments;

import java.lang.reflect.Array;
import java.util.*;

public class CoveringSegments {

    public int[] optimalPoints(Segment[] segments) {
        //write your code here
        ArrayList<Integer> pointsAlt = new ArrayList<Integer>();

        Arrays.sort(segments);
        //sorted segments by max point

        int i=0;
        while(i<segments.length) { //while i< n
            //check if it's not in the list > add it
            int right = segments[i].end;
            pointsAlt.add(right);

            while (i<segments.length && segments[i].start <=right && right <= segments[i].end)
                i++;
        }
        int [] points = new int[pointsAlt.size()];

        for(int j=0; j<pointsAlt.size(); j++ ) {
            points[j] = pointsAlt.get(j);
        }
        System.out.println(Arrays.toString(points));
        return points;
    }

    public class Segment implements Comparable<Segment> {
        int start, end;

        Segment(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public int compareTo(Segment compareSegment) {
            int compareValue = compareSegment.end;
            return this.end-compareValue;
        }

        public String toString() {
            return "{ " + start + ", " + end + "}";
        }

    }
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Segment[] segments = new Segment[n];
        for (int i = 0; i < n; i++) {
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            segments[i] = new Segment(start, end);
        }
        CoveringSegments coveringSegments = new CoveringSegments();
        int[] points = coveringSegments.optimalPoints(segments);
        System.out.println(points.length);
        for (int point : points) {
            System.out.print(point + " ");
        }
    }
}
 
