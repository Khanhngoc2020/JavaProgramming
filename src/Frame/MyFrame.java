package Frame;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame() {
        JFrame frame = new JFrame(); // create frame
        this.setTitle("Frame title goes here"); // set title of frame

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setSize(512, 384); // set size of frame
        //this.setResizable(false);// prevent frame from being resized
        this.setVisible(true); //make frame visible

        ImageIcon image = new ImageIcon("C:\\Users\\khanh\\IdeaProjects\\HelloWorld\\src\\Frame\\IconImage.png");
        this.setIconImage(image.getImage()); // change icon of frame
        this.getContentPane().setBackground(Color.PINK); // Change color of frame
    }
}
