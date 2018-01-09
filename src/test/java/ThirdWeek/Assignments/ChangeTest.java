package ThirdWeek.Assignments;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by victor on 09/01/18.
 */
@RunWith(JUnit4.class)
public class ChangeTest {

    private Change change = new Change();

    @Test
    public void testChangeNaive() {
        assertEquals(6, change.getChange(28));
        assertEquals(2, change.getChange(2));
        assertEquals(0, change.getChange(0));
        assertEquals(100, change.getChange(1000));
        assertEquals(98, change.getChange(962));
    }

}