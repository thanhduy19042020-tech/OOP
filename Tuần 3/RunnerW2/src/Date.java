public class Date {
    private int day;
    private int month;
    private int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public boolean earlierThan(Date that)
    {
        if(this.year>that.year)
            return false;
        else if(this.year < that.year ) return true;
        else if(this.month<that.month) return true;
        else return this.month == that.month && this.day < that.day;
    }
}
