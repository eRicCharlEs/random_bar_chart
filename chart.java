import java.awt.*;
import javax.swing.*;

public class chart extends JPanel {  
  // JFrame 
  static JFrame frame; 
  
  // JButton 
  static JButton button;  

  public void paintComponent(Graphics g) {
    // Get the dimensions of the panel
    int width = getWidth();
    int height = getHeight();
    g.setColor(Color.WHITE);

    for (int x = 30; x <= width; x += 10)
            for (int y = 30; y <= height; y += 10)
                g.drawRect(x, y, 30, 30);
  }
  public static void main(String[] args) {
    // create a new frame to store text field and button 
    frame = new JFrame("Random Bar Chart");
    frame.setBackground(Color.BLACK);

    // create a new buttons 
    button = new JButton("Redraw");


    chart container = new chart();
    frame.add(container, BorderLayout.CENTER);
    // frame.add(button, BorderLayout.SOUTH);

    // set the size of frame 
    frame.setSize(300, 300); 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    frame.setVisible(true);
  }
}