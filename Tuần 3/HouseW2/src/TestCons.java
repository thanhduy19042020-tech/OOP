import junit.framework.TestCase;

public class TestCons extends TestCase {
    public void testConstructor()
    {
        Address d1=new Address(23,"Maple Street","Brookline");
        HouseW2 h1=new HouseW2("Ranch",7,d1,375.000);
        AList a1=new Empty();
        AList a2=new Cons(h1,a1);

        Address d2=new Address(5,"Joye Road","Newton");
        HouseW2 h2=new HouseW2("Colonial", 9,d2,450.000);
        AList a3=new Cons(h2,a2);

        Address d3=new Address(83,"Winslow Road","Waltham");
        HouseW2 h3=new HouseW2("Cape", 6,d3,235.000);
        AList a4=new Cons(h3,a3);

    }
}
