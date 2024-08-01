import javax.swing.*;
public class DrawingTester
{
    public static void main(String[] args)
    {
        int frameWidth = 640;
        int frameHeight = 480;

        JFrame f = new JFrame();

        DrawingCanvas dc = new DrawingCanvas(frameWidth, frameHeight);

        f.add(dc);
        f.setSize(frameWidth,frameHeight);
        f.setTitle("3D Renderer");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}