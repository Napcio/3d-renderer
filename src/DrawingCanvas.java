import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class DrawingCanvas extends JComponent
{
    private int width;
    private int height;

    public DrawingCanvas(int w, int h)
    {
        width = w;
        height = h;
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;

        RenderingHints rh = new RenderingHints
        (
            RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON
        );
        g2d.setRenderingHints(rh);

        // Create background
        Rectangle2D.Double r = new Rectangle2D.Double(0, 0, width, height);
        g2d.setColor(new Color(100, 149, 237));
        g2d.fill(r);


        Point3D[] vertexTable = {
                new Point3D(100, 100, 10),
                new Point3D(400, 100, 10),
                new Point3D(400, 200, 10),
                new Point3D(100, 200, 10),
                new Point3D(100, 100, 400),
                new Point3D(400, 100, 400),
                new Point3D(400, 200, 400),
                new Point3D(100, 200, 400)
        };
        int[][] edgeTable = {
                {0, 1},
                {1, 2},
                {2, 3},
                {3, 0},

                {4,5},
                {5,6},
                {6,7},
                {7,4},

                {0,4},
                {1,5},
                {2,6},
                {3,7}
        };
        g2d.setColor(Color.BLACK);
        WireframeRenderer wr = new WireframeRenderer(g2d);
        wr.drawWireframe(vertexTable, edgeTable);
    }
}
