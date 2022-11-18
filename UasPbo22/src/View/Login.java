/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Main.Main;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author yudis
 */
public class Login {
    public static void tampilanLogin(){
         JFrame frame = new JFrame("Login");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button = new JButton();
        button.setText("Login");
        JButton button2 = new JButton();
        button2.setText("Back");
        
        JTextField nama, password;
        nama = new JTextField("nama");
        nama.setBounds(50, 100, 200, 30);
        password = new JTextField("password");
        password.setBounds(50, 150, 200, 30);

        JLabel labelaplikasi = new JLabel();
        labelaplikasi.setText("Aplikasi ITHB");

        panel.add(button);
        panel.add(button2);
        panel.add(labelaplikasi);
        panel.add(nama);
        panel.add (password);

        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    public void BackactionPerformed(ActionEvent e){  
          
           
    }  
}

