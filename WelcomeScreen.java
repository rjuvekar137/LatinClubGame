package com.apcs;

import javax.swing.*;
import java.awt.event.*;

public class WelcomeScreen extends JFrame {

    private JButton button1;
    private JTextField textField1;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        final JTextField tf = new JTextField();
        tf.setBounds(170,50, 50,20);
        tf.setText("Quest");
        tf.setEditable(false); // makes sure to set text field to be uneditable

        JButton b = new JButton("START.");
        b.setBounds(150,150,95,30);

        /*
        this is how to make the button do something
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                tf.setText("Welcome to Javatpoint.");
            }
        });*/

        f.add(b);
        f.add(tf);
        f.setSize(400,300);
        f.setLayout(null);
        f.setVisible(true);
    }

}
