package Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JFrame frame = new JFrame(); // create frame
        frame.setTitle("Frame title goes here"); // set title of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        frame.setSize(512, 384); // set size of frame
        //frame.setResizable(false);// prevent frame from being resized
        frame.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\khanh\\IdeaProjects\\HelloWorld\\src\\Frame\\IconImage.png");
        frame.setIconImage(image.getImage()); // change icon of frame
        frame.getContentPane().setBackground(Color.PINK); // Change color of frame
    }
}
