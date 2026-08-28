import junit.framework.TestCase;
public class TestCoffeeReceipt extends TestCase {
    public void testConstructor() {
        new CoffeeReceiptV2("Hawaiian Kona", 15.95, 100);
        new CoffeeReceiptV2("Ethiopian", 8.00, 1000);
        new CoffeeReceiptV2("Colombian Supreme ", 9.50, 1700);
    }
    public void testSellingCost() {
        CoffeeReceiptV2 hk = new CoffeeReceiptV2("Hawaiian Kona", 15.95, 100);
        assertEquals(hk.sellingCost(), 15.95*100*0.9, 0.001);

        CoffeeReceiptV2 e = new CoffeeReceiptV2("Ethiopian", 8.00, 1000);
        assertEquals(e.sellingCost(), 8.00*1000*0.9, 0.001);

        CoffeeReceiptV2 cs = new CoffeeReceiptV2("Colombian Supreme ", 9.50, 1700);
        assertEquals(cs.sellingCost(), 9.5*1700*0.9, 0.001);

    }
    public void testweightMore() {
        CoffeeReceiptV2 hk = new CoffeeReceiptV2("Hawaiian Kona", 15.95, 100);
        assertFalse(hk.weightMore(200));
    }
    public void testIsCheaperThan()
    {
        CoffeeReceiptV2 hk = new CoffeeReceiptV2("Hawaiian Kona", 15.95, 99);
        assertTrue(hk.isCheaperThan(new CoffeeReceiptV2("Ethiopian", 20.00, 100)));
    }
    public void testCostLessThan()
    {
        CoffeeReceiptV2 hk = new CoffeeReceiptV2("Hawaiian Kona", 15.95, 99);
        assertTrue(hk.CostLessThan(new CoffeeReceiptV2("Ethiopian", 20.00, 100)));
    }

}

