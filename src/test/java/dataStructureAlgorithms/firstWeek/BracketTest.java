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
        Assert.assertEquals("empty should return 0 ", "0", bracket.match(""));
        Assert.assertEquals("[] should return Success ", "Success", bracket.match("[]"));
        Assert.assertEquals("{}[] should return Success ", "Success", bracket.match("[]"));
        Assert.assertEquals("] should return 1 ", "1", bracket.match("]"));
        Assert.assertEquals("[[[ should return 3? ", "3", bracket.match("[[["));
        Assert.assertEquals("[ should return 1 ", "1", bracket.match("["));
        Assert.assertEquals("()[} should return 4 ", "4", bracket.match("()[}"));
    }
    @Test
    public void advancedMatchBracketTest () {
        Assert.assertEquals("([]){}((()))[{}] should return Success ", "Success", bracket.match("([]){}((()))[{}]"));
        Assert.assertEquals("(({}[])) should return Success ", "Success", bracket.match("(({}[]))"));
        Assert.assertEquals("] should return 1 ", "1", bracket.match("]"));
        Assert.assertEquals("[[[{{}[ should return 7? ", "7", bracket.match("[[[{{}["));
        Assert.assertEquals("{[} should return 3 ", "3", bracket.match("{[}"));
        Assert.assertEquals("foo(bar); should return Success", "Success", bracket.match("foo(bar);"));
        Assert.assertEquals("foo(bar[i); should return 10", "10", bracket.match("foo(bar[i);"));

    }
}