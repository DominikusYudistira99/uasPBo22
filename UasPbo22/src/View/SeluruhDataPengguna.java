/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author yudis
 */
public class SeluruhDataPengguna {
    public static void main(String[] args) {
     JFrame frame = new JFrame("Main Menu");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JButton button = new JButton();
        button.setText("Login Pengguna");
        JButton button2 = new JButton();
        button2.setText("Regristrasi Pengguna Baru");
        JButton button3 = new JButton();
        button3.setText("Lihat Data Pengguna Berdasarkan Kategori Dipilih");
        
        panel.add(button);
        panel.add(button2);
        panel.add(button3);
      

        frame.add(panel);
        frame.setSize(200, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}