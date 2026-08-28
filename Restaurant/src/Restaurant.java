import junit.framework.TestCase;
class Restaurant{
    private String name;
    private String kind;
    private String price;
    private Intersection intersection;

    public Restaurant(String name, String kind, String price, Intersection intersection)
    {
        this.name = name;
        this.kind = kind;
        this.price = price;
        this.intersection = intersection;
    }
}
