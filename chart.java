import java.awt.*;
import javax.swing.*;
import java.awt.BorderLayout;

class chart {
  public static void main(String[] args) {
    // Create frame 
    JFrame frame = new JFrame("Random Bar Chart");

    // Create a container panel with a Border layout
    JPanel container = new JPanel(new BorderLayout());
    
    // Create panel containing button
    JPanel buttonPanel = new JPanel(new BorderLayout());
    JButton redraw = new JButton("Redraw");
    buttonPanel.add(redraw, BorderLayout.CENTER);

    // Add panel containing the grid
    JPanel gridPanel = new JPanel(new BorderLayout());
    gridPanel.setBackground(Color.BLACK); // Change color of panel

    // Add both components (grid, button) to container
    container.add(gridPanel, BorderLayout.CENTER);
    container.add(buttonPanel, BorderLayout.SOUTH);

    // Add container to the form
    frame.add(container, BorderLayout.CENTER);

    // Resizes everything as the window shrinks and grows
    frame.pack();

    // Set initial size to.. (in pixels)
    frame.setSize(400, 400);

    // Ends the program when the window is closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Displays the window
    frame.setVisible(true);
  }
}