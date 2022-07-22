package LoginForm;

import javax.swing.*;
import java.awt.*;

public class WelcomePage {
    JFrame frame = new JFrame();
    JLabel welLabel = new JLabel("Congratolation!");

    WelcomePage(String userID){
        welLabel.setText("Welcome " + userID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.add(welLabel);

        welLabel.setBounds(80,150,260,35);
        welLabel.setFont(new Font(null, Font.ITALIC,20));
        welLabel.setForeground(Color.blue);


    }
}
