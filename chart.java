import java.awt.*;
import javax.swing.*;

public class chart extends JPanel {  
  // JFrame 
  static JFrame frame; 
  
  // JButton 
  static JButton button;  

  public void paintComponent(Graphics g) {
    // Set grid lines to white
    g.setColor(Color.WHITE);

    super.paintComponent(g);
    Graphics2D g2d = (Graphics2D) g.create();
    // Determine size of grid
    int size = Math.min(getWidth() - 4, getHeight() - 4) / 10;

    // Draw 10x10 grid
    int y = (getHeight() - (size * 10)) / 2;
    for (int horz = 0; horz < 10; horz++) {
        int x = (getWidth() - (size * 10)) / 2;
        for (int vert = 0; vert < 10; vert++) {
            g.drawRect(x, y, size, size);
            x += size;
        }
        y += size;
    }
    g2d.dispose();
  }
  public static void main(String[] args) {
    // create a new frame to store text field and button 
    frame = new JFrame("Random Bar Chart");

    // create a new buttons 
    button = new JButton("Redraw");

    // Create new chart
    chart container = new chart();
    container.setBackground(Color.BLACK);

    // Add components to frame
    frame.add(container, BorderLayout.CENTER);
    frame.add(button, BorderLayout.SOUTH);

    // set the size of frame 
    frame.setSize(300, 300); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    frame.setVisible(true);
  }
}