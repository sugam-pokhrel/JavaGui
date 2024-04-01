import java.awt.Color;

import javax.swing.*;
public class test{


    public static void main(String[] args){

        JLabel label = new JLabel("Hello World");
        label.setBounds(150, 150, 100, 20);
     
       
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setBackground(Color.red);
        panel.setBounds(0, 0, 20, 50);
        
        frame.add(label);
        
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        
        
        System.out.println("Hello World");
    }
}