import junit.framework.TestCase;

public class TestBook extends TestCase {
    public void testConstructor()
    {
        new Book(new Author("ThanhDy", 2007),
                "Robinson Crusoe", 36.67,
                2025);
    }
}
