public class Cons extends AList {
    private Restaurant2 first;
    private AList rest;

    public Cons(Restaurant2 first, AList rest)
    {
        this.first = first;
        this.rest = rest;
    }
}
