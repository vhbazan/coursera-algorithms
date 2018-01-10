package ThirdWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by victor on 10/01/18.
 */
@RunWith(JUnit4.class)
public class CoveringSegmentsTest {

    CoveringSegments coveringSegments = new CoveringSegments();

    @Test
    public void optimalPointsTest () {
        CoveringSegments.Segment[] segments = new CoveringSegments.Segment[4];
        segments[0] = coveringSegments.new Segment(4, 7);
        segments[1] = coveringSegments.new Segment(1, 3);
        segments[2] = coveringSegments.new Segment(2, 5);
        segments[3] = coveringSegments.new Segment(5, 6);
        int [] result = {3, 6};
        assertTrue(Arrays.equals(result, coveringSegments.optimalPoints(segments)));

    }
}