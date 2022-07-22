package Frame;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("N:\\Khanh Ngoc\\Java programming\\Text File Java\\Panel.png");
        JLabel label = new JLabel("Hi!");
        label.setIcon(image);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        //label.setBounds(0,0,75,75);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,0,250,250);
        redPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
        bluePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        greenPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        greenPanel.add(label);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);




    }
}
