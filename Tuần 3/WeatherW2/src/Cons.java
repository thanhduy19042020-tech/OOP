public class Cons extends AList{
    private WeatherRecord first;
    private AList rest;

    public Cons(WeatherRecord first,AList rest){
        this.first = first;
        this.rest = rest;
    }
}
