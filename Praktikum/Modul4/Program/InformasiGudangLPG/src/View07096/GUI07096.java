/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View07096;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI07096 {
    JFrame LogReg = new JFrame();
    JLabel login,top;
    JTextField textnamalogin,textpasswordlogin;
    JLabel labelnamalogin,labelpasswordlogin;
    JButton check;
    JPasswordField passwordlogin;
    JRadioButton radiobmasuk,radiobkeluar;
    private int ceklogin = 0;
    
    public GUI07096() {
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.CYAN);
        top = new JLabel("INFORMASI GUDANG LPG ");
        top.setBounds(100, 10, 550, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);

        login = new JLabel("LOGIN");
        login.setBounds(300, 50, 100, 100);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);
        
        radiobmasuk = new JRadioButton("Barang Masuk");
    	radiobmasuk.setBounds(250,150,100,30);
    	radiobmasuk.setBackground(Color.BLUE);
    	LogReg.add(radiobmasuk);
        
        radiobkeluar = new JRadioButton("Barang Keluar");
    	radiobkeluar.setBounds(370,150,100,30);
    	radiobkeluar.setBackground(Color.RED);
    	LogReg.add(radiobkeluar);

        labelnamalogin = new JLabel("NAMA");
        labelnamalogin.setBounds(250, 180, 80, 30);
        LogReg.add(labelnamalogin);

        textnamalogin = new JTextField();
        textnamalogin.setBounds(250, 210, 220, 30);
        LogReg.add(textnamalogin);

        labelpasswordlogin = new JLabel("PASSWORD");
        labelpasswordlogin.setBounds(250, 240, 100, 30);
        LogReg.add(labelpasswordlogin);

        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(250, 270, 220, 30);
        LogReg.add(passwordlogin);

        check = new JButton("LOGIN");
        check.setBounds(300, 320, 100, 40);
        check.setBackground(Color.GREEN);
        LogReg.add(check);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radiobmasuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiobmasuk.isSelected()) {
                    radiobkeluar.setSelected(false);
                    ceklogin = 1;
                }
            }
    	});
        radiobkeluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(radiobkeluar.isSelected()) {
                    radiobmasuk.setSelected(false);
                    ceklogin = 2;
                }
            }
    	});
        check.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(ceklogin == 1) {
                    try {
                        allobjctrl07096.admin.DataAdmin();
                        allobjctrl07096.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String Admin = allobjctrl07096.admin.adminEntity().getAdmin();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+Admin , "information", JOptionPane.INFORMATION_MESSAGE);
                        BarangMasukGUI07096 barangmasuk = new BarangMasukGUI07096();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else if(ceklogin == 2) {
                    try {
                        allobjctrl07096.admin.DataAdmin();
                        allobjctrl07096.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String Admin = allobjctrl07096.admin.adminEntity().getAdmin();
                        JOptionPane.showMessageDialog(null, "Selamat Datang "+Admin , "information", JOptionPane.INFORMATION_MESSAGE);
                        BarangKeluarGUI07096 barangkeluar = new BarangKeluarGUI07096();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(null, "Nama atau Password Salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih Radio Button Terlebih Dahulu!","information", JOptionPane.INFORMATION_MESSAGE);
                    GUI07096 lanjut = new GUI07096();
                }
            }
        });
    }

    void kosong() {
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
