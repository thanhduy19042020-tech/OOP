import junit.framework.TestCase;

public class TestRestaurant extends TestCase {
    public void testConstructor(){
        new Restaurant("Chè Thanh Duy","Chè Đậu Đỏ","cheap",new Intersection("40th", "Hang Tre"));
    }
}
