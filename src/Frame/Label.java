package Frame;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Label {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JLabel label = new JLabel("Java programming");
        Border border = BorderFactory.createLineBorder(Color.PINK);



        ImageIcon image = new ImageIcon("N:\\Khanh Ngoc\\Java programming\\Text File Java\\Label1.jpg");
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, RIGHT of imageIcon
        label.setVerticalTextPosition(JLabel.TOP);
        label.setIcon(image);
        label.setIconTextGap(25);//set gap of text to image
        label.setForeground(Color.PINK);
        label.setFont(new Font("Serif", Font.PLAIN, 20)); //Font type - Font kind - size
        label.setBackground(Color.BLACK);
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon - text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizonta of icon - text
       // label.setBounds(100,30,250,300);

        // frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(label);
        // frame.setLayout(null);
        frame.pack();
        frame.setResizable(false);
    }
}
