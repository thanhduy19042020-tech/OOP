import junit.framework.TestCase;

public class TestCons extends TestCase {
    public void testConstructor(){
        Intersection i1= new Intersection("7th Ave","65th Street");
        Restaurant2 r1=new Restaurant2("La Crepe","French food","Moderate",i1);
        AList a1=new EmptyList();
        AList a2=new Cons(r1,a1);

    }
}
