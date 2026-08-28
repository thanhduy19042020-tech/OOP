import junit.framework.TestCase;

import java.util.Date;
public class TestRunner extends TestCase {
    public void testConstructor()
    {
        new Entry(new date(5, 6, 2003), 5.3, 27, "Good");
    }
    public void testearlierThan()
    {
        date d2 = new date(6, 6, 2003);
        assertTrue(d2.earlierThan(new date(23, 6, 2003)));
    }
    public void testpace()
    {
        Entry hk  = new Entry(new date(5, 6, 2004), 5.3, 27, "good");
        assertEquals(5.094, hk.pace(), 0.001);
    }
}
