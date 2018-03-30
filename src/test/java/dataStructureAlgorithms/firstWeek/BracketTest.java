package dataStructureAlgorithms.firstWeek;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by victor on 29/03/2018.
 */
@RunWith(JUnit4.class)
public class BracketTest {

    private Bracket bracket = new Bracket();

    @Test
    public void basicMatchBracketTest () {
        Assert.assertEquals("[] should return Success ", "Success", bracket.match("[]"));
        Assert.assertEquals("{}[] should return Success ", "Success", bracket.match("[]"));
        Assert.assertEquals("] should return 1 ", "1", bracket.match("]"));
        Assert.assertEquals("[ should return 1 ", "1", bracket.match("["));


    }
}