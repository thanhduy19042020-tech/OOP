import junit.framework.TestCase;

public class TestHouse extends TestCase {
    public void testConstructor()
    {
        new House("Ranch", 7, 375000, "23 Maple Street"," Brookline");
    }
    public void testhasMoreRooms()
    {
        House h1 = new House("Ranch", 7, 375000, "23 Maple Street"," Brookline");
        assertFalse(h1.hasMoreRooms(new House("Colonial", 9, 450000, "5 Joye Road", "Newton")));
    }
    public void testinThisCity()
    {
        House h1 = new House("Ranch", 7, 375000, "23 Maple Street","Brookline");
        assertTrue(h1.inThisCity("Brookline"));
    }
    public void testSameCity()
    {
        House h1 = new House("Ranch", 7, 375000, "23 Maple Street"," Brookline");
        assertFalse(h1.SameCity(new House("Colonial", 9, 450000, "5 Joye Road", "Newton")));
    }
}
