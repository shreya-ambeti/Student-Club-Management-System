/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.club.management.system;

/**
 *
 * @author Shreya Ambeti
 */

import java.awt.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{
    
    Random ran = new Random();
    int number = ran.nextInt(999999);
    
    JTextField tfname, tfjoining, tfaddress, tfphone, tfaadhar, tfemail,  tfclubrole;
    JDateChooser dcdob;
    JComboBox cbbranch,cbyear;
    JLabel lblstId;
    JButton add, back;
    
    AddStudent() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Add Student Details");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        tfname = new JTextField();
        tfname.setBounds(200, 150, 150, 30);
        add(tfname);
        
        JLabel labeljoin = new JLabel("Year of Joining");
        labeljoin.setBounds(400, 150, 150, 30);
        labeljoin.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeljoin);
        
        tfjoining = new JTextField();
        tfjoining.setBounds(600, 150, 150, 30);
        add(tfjoining);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        dcdob = new JDateChooser();
        dcdob.setBounds(200, 200, 150, 30);
        add(dcdob);
        
        JLabel labelyear = new JLabel("Year");
        labelyear.setBounds(400, 200, 150, 30);
        labelyear.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelyear);
        
        String year[] = {"1st year","2nd year","3rd year","4th year"};
        cbyear = new JComboBox(year);
        cbyear.setBackground(Color.WHITE);
        cbyear.setBounds(600, 200, 150, 30);
        add(cbyear);
        
        
        
        JLabel labeladdress = new JLabel("Address");
        labeladdress.setBounds(50, 250, 150, 30);
        labeladdress.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeladdress);
        
        tfaddress = new JTextField();
        tfaddress.setBounds(200, 250, 150, 30);
        add(tfaddress);
        
        JLabel labelphone = new JLabel("Phone");
        labelphone.setBounds(400, 250, 150, 30);
        labelphone.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelphone);
        
        tfphone = new JTextField();
        tfphone.setBounds(600, 250, 150, 30);
        add(tfphone);
        
        JLabel labelemail = new JLabel("Email");
        labelemail.setBounds(50, 300, 150, 30);
        labelemail.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelemail);
        
        tfemail = new JTextField();
        tfemail.setBounds(200, 300, 150, 30);
        add(tfemail);
        
        JLabel labelbranch = new JLabel("Branch");
        labelbranch.setBounds(400, 300, 150, 30);
        labelbranch.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelbranch);
        
        String branch[] = {"ECE","CE","ME","Civil","EEE","IT"};
        cbbranch = new JComboBox(branch);
        cbbranch.setBackground(Color.WHITE);
        cbbranch.setBounds(600, 300, 150, 30);
        add(cbbranch);
        
        JLabel labelrole = new JLabel("Club Role");
        labelrole.setBounds(50, 350, 150, 30);
        labelrole.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelrole);
        
        tfclubrole = new JTextField();
        tfclubrole.setBounds(200, 350, 150, 30);
        add(tfclubrole);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        tfaadhar = new JTextField();
        tfaadhar.setBounds(600, 350, 150, 30);
        add(tfaadhar);
        
        JLabel labelstid = new JLabel("Student id");
        labelstid.setBounds(50, 400, 150, 30);
        labelstid.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelstid);
        
        lblstId = new JLabel("" + number);
        lblstId.setBounds(200, 400, 150, 30);
        lblstId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblstId);
        
        add = new JButton("Add Details");
        add.setBounds(250, 550, 150, 40);
        add.addActionListener(this);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add(add);
        
        back = new JButton("Back");
        back.setBounds(450, 550, 150, 40);
        back.addActionListener(this);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        add(back);
        
        setSize(900, 700);
        setLocation(300, 50);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String name = tfname.getText();
            String joining = tfjoining.getText();
            String dob = ((JTextField) dcdob.getDateEditor().getUiComponent()).getText();
            String year = (String) cbyear.getSelectedItem();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String branch = (String) cbbranch.getSelectedItem();
            String clubrole = tfclubrole.getText();
            String aadhar = tfaadhar.getText();
            String stId = lblstId.getText();
            
            try {
                Conn conn = new Conn();
                String query = "insert into studentclub values('"+name+"', '"+joining+"', '"+dob+"', '"+year+"', '"+address+"', '"+phone+"', '"+email+"', '"+branch+"', '"+clubrole+"', '"+aadhar+"', '"+stId+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details added successfully");
                setVisible(false);
                new Home();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
            new Home();
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}
