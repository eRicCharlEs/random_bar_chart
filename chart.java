import java.awt.*;
import javax.swing.*;
import java.awt.geom.Line2D;
import java.util.Random;
import java.awt.event.*;

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

    int d = getHeight();

    // Draw 10x10 grid using rectangles
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

    Graphics2D g2 = (Graphics2D) g.create();
    g2.setStroke(new BasicStroke(5f));
    g2.setColor(Color.RED);

    for (int i = 0; i < 10; i++) {
      // (x1,y1) (x2, y2)
      int x_coord = generateRandomNumber(getWidth());
      int y_coord = generateRandomNumber(getHeight());
      g2.draw(new Line2D.Double(x_coord, d, x_coord, y_coord));
    }
  }
  public static void main(String[] args) {
    // create a new frame to store text field and button 
    frame = new JFrame("Random Bar Chart");

    // create a new buttons 
    button = new JButton("Redraw");

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        System.out.println("Yo Mama!");
      }
    });

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

  public int generateRandomNumber(int size) {
    // create instance of Random class 
    Random rando = new Random();

    // Generate random integers in range 0 to 999 
    // set range between min and max 
    int rand_one = rando.nextInt(size-4) + 4 ; 

    return rand_one;
  }
}
