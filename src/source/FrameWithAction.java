package source;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FrameWithAction extends JFrame implements ActionListener {
    JFrame frame = new JFrame();
    JButton button = new JButton();
    JLabel label = new JLabel();
    public FrameWithAction(){

        ImageIcon icon = new ImageIcon("N:\\Khanh Ngoc\\Java programming\\Text File Java\\Button_prev_ui.png");
        ImageIcon iconLabel = new ImageIcon("N:\\Khanh Ngoc\\Java programming\\Text File Java\\LabelButton.png");

        label.setIcon(iconLabel);
        label.setBounds(150,180,150,150);
        label.setVisible(false);

        button.setBounds(100,100,250,80);
        button.addActionListener(e -> System.out.println("correct!"));
        button.setText("I'm a button");
        button.setFocusable(false);
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans", Font.BOLD, 25));
        button.setIconTextGap(-10);
        button.setBackground(Color.PINK);
        button.setForeground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        //button.setEnabled(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setVisible(true);
        this.setLayout(null);
        this.add(button);
        this.add(label);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            label.setVisible(true);
        }
    }
}

