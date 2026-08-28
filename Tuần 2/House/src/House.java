import junit.framework.TestCase;

public class House{
    private String kind;
    private int rooms;
    private double price;
    private String address;
    private String city;

    public House(String kind, int rooms, double price, String address, String city)
    {
        this.kind = kind;
        this.rooms = rooms;
        this.price = price;
        this.address = address;
        this.city = city;
    }
    public boolean hasMoreRooms(House that)
    {
        return this.rooms > that.rooms;
    }
    public boolean inThisCity(String s)
    {
        return this.city.equals(s);
    }
    public boolean SameCity(House that) {
        return this.city.equals(that.city);
    }
}