public class Point2D
{
    public int x;
    public int y;

    public Point2D()
    {
        set(0, 0);
    }
    public Point2D(int x, int y)
    {
        set(x, y);
    }
    public void set(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
