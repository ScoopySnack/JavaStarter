package gr.aueb.cf.ch22_swingfrontend;

import java.awt.*;

public class Main {

    private static final HelloFrame helloFrame = new HelloFrame(); // Create a private instance of the HelloFrame class

    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                helloFrame.setVisible(true); // Make the window visible
//            }
//        });

        EventQueue.invokeLater(() -> helloFrame.setVisible(true)); // Make the window visible
    }
}
