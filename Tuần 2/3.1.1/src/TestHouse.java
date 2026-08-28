import junit.framework.TestCase;

public class TestHouse extends TestCase {
    public void testConstructor()
    {
        new House("Ranch", 7,
                new Address(23, "Maple Street", "Brookline"),
                375.000);
    }
}
