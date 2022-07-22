package Try;

import Frame.HASHandTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login:");
    JButton resetButton = new JButton("Reset:");

    JTextField userIDFiel = new JTextField();
    JPasswordField passwordFiel = new JPasswordField();

    JLabel IDLabel = new JLabel("User ID:");
    JLabel passLabel = new JLabel("Password:");
    JLabel messageLabel = new JLabel();
    HashMap <String, String> users = new HashMap<>();
    LoginPage(HashMap<String , String> LoginInFoOriginal){
        users = LoginInFoOriginal;

        IDLabel.setBounds(50,100,75,25);
        passLabel.setBounds(50,150,75,25);
        messageLabel.setBounds(125,250,250,32);
        messageLabel.setFont(new Font(null, Font.ITALIC, 20));

        userIDFiel.setBounds(125,100,200,25);
        passwordFiel.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        resetButton.setBounds(225,200,100,25);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.add(IDLabel);
        frame.add(passLabel);
        frame.add(messageLabel);
        frame.add(userIDFiel);
        frame.add(passwordFiel);
        frame.add(loginButton);
        frame.add(resetButton);





    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton){
            userIDFiel.setText("");
            passwordFiel.setText("");
        }
        if(e.getSource() == loginButton){
            String userID = userIDFiel.getText();
            String password = String.valueOf(passwordFiel.getPassword());

            if(users.containsKey(userID)){
                if(users.get(userID).equals(password)){
                    messageLabel.setForeground(Color.GREEN);
                    messageLabel.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userID);
                }else{
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Login unsuccessful");
                }
            }else{
                messageLabel.setForeground(Color.red);
                messageLabel.setText("Username can not found ");
            }
        }
    }
}
