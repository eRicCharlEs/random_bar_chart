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
    Graphics2D g2d = (Graphics2D)g;

    // Determine width and height size of grid
    int widthSize = getWidth() / 10;
    int heightSize = getHeight() / 10;

    // Draw 10x10 grid using rectangles
    int y = 0;

    for (int horz = 0; horz < 10; horz++) {
      // int x = (getWidth() - (size * 10)) / 2;
      int x = 0;
      for (int vert = 0; vert < 10; vert++) {
        g.drawRect(x, y, widthSize, heightSize);
        x += widthSize;
      }

      y += heightSize;
    }

    g2d.setStroke(new BasicStroke(10f));
    g2d.setColor(Color.RED);
    
    for (int i = 0; i < 10; i++) {
      // (x1,y1) (x2, y2)
      int x_coord = generateRandomNumber(getWidth());
      int y_coord = generateRandomNumber(getHeight());
      g2d.draw(new Line2D.Double(x_coord, getHeight(), x_coord, y_coord));
    }
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

    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e){
        System.out.println("Yo Mama!");
      }
    });

    // set the size of frame 
    frame.setSize(300, 300); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    frame.setVisible(true);
  }

  public int generateRandomNumber(int max) {
    // create instance of Random class 
    Random rando = new Random();

    // Generate random integers in range 0 to 999 
    // set range between min and max 
    int rand_one = rando.nextInt(max); 

    return rand_one;
  }
}
