import junit.framework.TestCase;
public class TestImage extends TestCase {
    public void testConstructor()
    {
        new Image(5, 10, "small.gif", "low");
        new Image(120, 200, "med.gif", "low");
        new Image(1200, 1000, "large.gif", "high");
    }
    public void testIsPortrait()
    {
        Image img1 = new Image(5, 10, "small.gif", "low");
        assertFalse(img1.IsPortrait());
    }
    public void testsize()
    {
        Image img1 = new Image(5, 10, "small.gif", "low");
        assertEquals(50, img1.size(), 0.1);
    }
    public void testIsLarger()
    {
        Image img1 = new Image(5, 10, "small.gif", "low");
        Image img2 = new Image(120, 200, "med.gif", "low");
        assertFalse(img1.IsLarger(img2));
    }
    public void testsizeString()
    {
        Image img1 = new Image(5, 10, "small.gif", "low");
        Image img2 = new Image(120, 200, "med.gif", "low");
        assertEquals("small",img1.sizeString());
        assertEquals("medium",img2.sizeString());
    }
}
