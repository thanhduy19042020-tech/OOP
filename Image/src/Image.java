import junit.framework.TestCase;
public class Image {
    private int height; // pixels
    private int width; // pixels
    private String fileName;
    private String quality; // low, medium, or high

    public Image(int height, int width, String fileName, String quality) {
        this.height = height;
        this.width = width;
        this.fileName = fileName;
        this.quality = quality;
    }
    public boolean IsPortrait()
    {
        return this.height > this.width;
    }
    public int size()
    {
        return this.height * this.width;
    }
    public boolean IsLarger(Image that)
    {
        return this.size() > that.size();
    }
    public String sizeString()
    {
        if(this.height * this.width <= 10000) return "small";
        else if(this.height * this.width <= 1000000) return "medium";
        else return "large";
    }
}
