package Frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    class LoginForm extends JFrame implements ActionListener {
            JButton submitButton;
            JButton cancelButton;
            JPanel newPanel;
            JLabel userLabel, passLabel;
            final JTextField textField1, textField2;

         LoginForm(){
             userLabel = new JLabel();
             userLabel.setText("Username"); // setlabel value for textField1

             textField1 = new JTextField(15); // create length of the text

             passLabel = new JLabel();
             passLabel.setText("Password");

             textField2 = new JTextField(15); // create length of the text

             submitButton = new JButton("Submit");
             cancelButton = new JButton("Cancel");

             newPanel = new JPanel(new GridLayout(3, 1));
             newPanel.add(userLabel);
             newPanel.add(textField1);
             newPanel.add(passLabel);
             newPanel.add(textField2);
             newPanel.add(submitButton);
             newPanel.add(cancelButton);

             add(newPanel, BorderLayout.CENTER);

             submitButton.addActionListener(this); //add action listener to button
             cancelButton.addActionListener(this);
             setTitle("Login form"); // set title to the login form

         }

         public void actionPerformed(ActionEvent ae){
             String userValue = textField1.getText(); //get user entered username from the textField1
             String passValue = textField2.getText(); //get user entered pasword from the textField2

             if(userValue.equals("test1@gmail.com") && passValue.equals("test")){
                 NewPage page = new NewPage();
                 page.setVisible(true);
                 JLabel wel_label = new JLabel("Welcome: "+userValue);
                 page.getContentPane().add(wel_label);
             }else{
                 System.out.println("Please enter valid username or password");
             }
         }
    }
