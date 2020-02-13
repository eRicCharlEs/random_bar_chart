import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Chart extends JFrame {

    private JButton button_one;
    private Panel_One panel;
    
    // Create Frame
    public Chart() {
        // Set frame attributes
        setSize(500, 500);
        setResizable(true); // Set true so the user can define the size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close program when frame is close
        
        // Create a new JPanel object
        panel = new Panel_One();

        // // Create button that reads Redraw and perform action 
        button_one = new JButton("Redraw");
        button_one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pressed");
                // Create a new JPanel object
                remove(panel);
                panel = new Panel_One();

                // Add components to frame and redraw
                add(panel, BorderLayout.CENTER);
                pack();
                setSize(500, 500);
            }
        });
        // Add components to frame
        add(panel, BorderLayout.CENTER);
        add(button_one, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // displayFrame();
        Chart Random_Bar_Chart = new Chart();
        Random_Bar_Chart.setVisible(true);
    }
}
