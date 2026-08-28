import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class CoffeeReceipt {
    private String kind;
    private double weight;
    private double pricePerPound;

    public CoffeeReceipt(String kind, double weight, double pricePerPound){
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }
    //to compute the total cost of this coffee purchase [in cents]
    public double sellingCost(){
        return this.pricePerPound * this.weight;
    }
    public boolean weightMore(double n)
    {
        return this.weight > n;
    }
    public boolean isCheaperThan(CoffeeReceipt that)
    {
        return this.pricePerPound < that.pricePerPound;
    }
    public boolean CostLessThan(CoffeeReceipt that)
    {
        //return this.pricePerPound * this.weight < that.pricePerPound * that.weight;
        return this.sellingCost() < that.sellingCost();
    }

}