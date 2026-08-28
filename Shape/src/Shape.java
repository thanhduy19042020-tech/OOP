public abstract class Shape{
    protected CartesianPoint location;

    protected Shape(CartesianPoint location)
    {
        this.location = location;
    }
    //instance: là 1 đối tượng/ 1 thể hiện cụ thể của đối tượng đó
    //lớp abstract sẽ k có instance
    //mỗi 1 lớp đều là 1 type
}