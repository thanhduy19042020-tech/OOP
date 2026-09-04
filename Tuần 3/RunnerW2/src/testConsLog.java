import junit.framework.TestCase;

public class testConsLog extends TestCase {
    public void testConstructor(){
        Date d1 = new Date(24, 4, 2007);
        Entry e1 = new Entry(d1,5.3, 27, "Good");
        ALog a1 = new EmptyLog();
        ALog a2 = new ConsLog(e1, a1);

        Date d2= new Date(2,2,2007);
        Entry e2 = new Entry(d2, 9.0, 60, "Good");
        ALog a4 = new ConsLog(e2, a2);

        Date d3= new Date(30,10,2007);
        Entry e3 = new Entry(d2, 9.0, 60, "Good");
        ALog a34 = new ConsLog(e3, a2);

        Date d4= new Date(5,6,2004);
        Entry e4 = new Entry(d2, 15.3, 87, "Great");
        ALog a44 = new ConsLog(e4, a2);

        Date d5= new Date(6,6,2004);
        Entry e5 = new Entry(d2, 12.8, 84, "Good");
        ALog a55 = new ConsLog(e5, a2);

        Date d6= new Date(23,6,2004);
        Entry e6 = new Entry(d2, 26.2, 250, "Dead");
        ALog a66 = new ConsLog(e6, a2);

        Date d7= new Date(28,6,2004);
        Entry e7 = new Entry(d2, 26.2, 150, "Recovery");
        ALog a77 = new ConsLog(e7, a2);
    }
}
