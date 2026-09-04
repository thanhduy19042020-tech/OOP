import junit.framework.TestCase;

public class TestConstructor extends TestCase {
    public void testConstructor()
    {
        WeatherRecord w1 = new WeatherRecord(new Date(2,2,2007),
                new Temperature(15,13), new Temperature(15, 14),
                new Temperature(15,13),
                7.1);
        AList a1 = new Empty();
        AList a2 = new Cons(w1, a1);
    }
}
