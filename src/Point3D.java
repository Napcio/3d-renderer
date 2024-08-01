public class Point3D
{
    public int x;
    public int y;
    public int z;

    public Point3D()
    {
        set(0, 0, 0);
    }
    public Point3D(int x, int y, int z)
    {
        set(x, y, z);
    }
    public void set(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
