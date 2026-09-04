import junit.framework.TestCase;

public class TestConstructor extends TestCase {
    public void testConstructor()
    {
        BookW2 b1=new BookW2(new Author("Daniel Defoe",11),"Robinson Crusoe", 15.50, 1719);
        AList a1=new Empty();
        AList a2=new Cons(b1,a1);

        BookW2 b2=new BookW2(new Author("Joseph Conrad",8),"Heart of Darkness", 12.80, 1902);
        AList a3=new Cons(b2,a2);

        BookW2 b3=new BookW2(new Author("Pat Conroy",12), "Beach Music", 9.50, 1996);
        AList a4=new Cons(b3,a3);
    }
}
