package gr.aueb.cf.ch22_swingfrontend;

import javax.swing.*;

public class HelloSwing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        jFrame.setTitle("First Swing Application"); // Set the title of the window
        jFrame.setSize(600, 300); // Set the size of the window

        jFrame.setLocationRelativeTo(null); // Align the window to the center of the screen

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the window is closed

        JPanel contentPane = new JPanel();
        jFrame.setContentPane(contentPane);

        contentPane.add(new JLabel("Hello World!")); // Add a label to the window
        jFrame.setVisible(true); // Make the window visible
    }
}
