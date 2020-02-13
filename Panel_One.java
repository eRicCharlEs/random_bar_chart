// For Drawing
import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;
// For random number
import java.util.Random;

public class Panel_One extends JPanel {
            
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Don't really understand this just yet

        // Set panel attributes
        g.setColor(Color.WHITE); // Line color(paintComponent)
        setBackground(Color.BLACK); // Panel background color

        Graphics2D g2d = (Graphics2D)g;

        // Determine width and height size of grid
        int widthSize = getWidth() / 10;
        int heightSize = getHeight() / 10;

        // Draw 10x10 grid using rectangles
        int y = 0;

        for (int horz = 0; horz < 10; horz++) {
            int x = 0;
            for (int vert = 0; vert < 10; vert++) {
                g.drawRect(x, y, widthSize, heightSize);
                x += widthSize;
            }
            y += heightSize;
        }

        // Change line color
        g2d.setStroke(new BasicStroke(10f));
        g2d.setColor(Color.RED);

        for (int i = 0; i < 10; i++) {
            // (x1,y1) (x2, y2)
            int x_coord = generateRandomNumber(getWidth());
            int y_coord = generateRandomNumber(getHeight());
            g2d.draw(new Line2D.Double(x_coord, getHeight(), x_coord, y_coord));
        }
    }

    public static int generateRandomNumber(int max) {
        // create instance of Random class 
        Random rando = new Random();
    
        // Generate random integers in range 0 to 999 
        // set range between min and max 
        int rand_one = rando.nextInt(max); 
    
        return rand_one;
      }

}