package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame  extends JFrame {

    public HelloFrame(){
        // Set the title of the window, this is the same as super.setTitle("Hello Coding Frame");
        this.setTitle("Hello Coding Frame");

        // Set the size of the window, this. can be omitted
        this.setSize(400, 200);

        // Align the window to the center of the screen
        this.setLocationRelativeTo(null);

        // Close the application when the window is closed
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //JPanel is a container that can hold other components
        JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);

        // Add a label to the window
        contentPane.add(new JLabel("Coding Factory"));

        // Create a button
        JButton button = new JButton("Click me!");
        contentPane.add(button);

        //add an action listener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { // When the button is clicked, show a message dialog
                JOptionPane.showMessageDialog(null, "Hello Coding Factory", "Hello", JOptionPane.INFORMATION_MESSAGE);
            }
        });

    }
}
