import junit.framework.TestCase;
import static junit.framework.Assert.assertEquals;
public class CoffeeReceiptV2 {
    private String kind;
    private double weight;
    private double pricePerPound;

    public CoffeeReceiptV2(String kind, double weight, double pricePerPound){
        this.kind = kind;
        this.pricePerPound = pricePerPound;
        this.weight = weight;
    }
    //to compute the total cost of this coffee purchase [in cents]
    public double sellingCost(){
        if(this.weight<5) return this.pricePerPound * this.weight;
        else if(this.weight<20) return this.pricePerPound * this.weight *0.9;
        else return this.pricePerPound * this.weight * 0.75;
    }
    public boolean weightMore(double n)
    {
        return this.weight > n;
    }
    public boolean isCheaperThan(CoffeeReceiptV2 that)
    {
        return this.pricePerPound < that.pricePerPound;
    }
    public boolean CostLessThan(CoffeeReceiptV2 that)
    {
        //return this.pricePerPound * this.weight < that.pricePerPound * that.weight;
        return this.sellingCost() < that.sellingCost();
    }

}