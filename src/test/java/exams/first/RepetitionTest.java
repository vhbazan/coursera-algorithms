package exams.first;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import sun.jvm.hotspot.utilities.Interval;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by vhbazanm on 01.04.2018.
 */
@RunWith(JUnit4.class)
public class RepetitionTest {

    private Repetition repetition = new Repetition();

    @Test
    public void basicTest() {

        List<Interval> ranges = new ArrayList<Interval>(3);
        ranges.add(new Interval(1.5, 4));
        ranges.add(new Interval(2.1, 7));
        ranges.add(new Interval(3.1, 3.9));
        //"should return 3.1 when the intervals are [1.5, 4], [2.1, 7], [3.1, 3.9]:"
        Assert.assertEquals(3.1d , repetition.getMostRepeatedValue(ranges), 0.1);

    }

}