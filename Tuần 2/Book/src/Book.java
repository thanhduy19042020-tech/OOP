class Book{
    private Author author;
    private String bookName;
    private double price;
    private int year;

    public Book(Author author, String bookName, double price, int year)
    {
        this.author = author;
        this.bookName = bookName;
        this.price = price;
        this.year = year;
    }
}