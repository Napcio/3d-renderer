import java.awt.*;
import java.awt.geom.Line2D;

public class WireframeRenderer
{
    private final int focalLength = 100;
    private Graphics2D g2d;

    public WireframeRenderer(Graphics2D g2d)
    {
        this.g2d = g2d;
    }

    public void drawWireframe(Point3D[] vertexTable, int[][] edgeTable)
    {
        Point2D[] projectedVertexTable = new Point2D[vertexTable.length];

        for (int i = 0; i < vertexTable.length; i++)
        {
            projectedVertexTable[i] = new Point2D();
            projectedVertexTable[i].x = (vertexTable[i].x * focalLength) / (focalLength + vertexTable[i].z);
            projectedVertexTable[i].y = (vertexTable[i].y * focalLength) / (focalLength + vertexTable[i].z);
        }

        for (int[] pointPair : edgeTable)
        {
            Line2D.Double line = new Line2D.Double
                    (
                            projectedVertexTable[pointPair[0]].x,
                            projectedVertexTable[pointPair[0]].y,
                            projectedVertexTable[pointPair[1]].x,
                            projectedVertexTable[pointPair[1]].y
                    );
            g2d.draw(line);
        }
    }
}
