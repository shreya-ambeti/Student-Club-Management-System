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
import java.awt.event.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener{
    
    JTextField tfname, tfjoining, tfaddress, tfphone, tfaadhar, tfemail, tfyear, tfclubrole,tfbranch;
    JLabel lblstId;
    JButton add, back;
    String stId;
    
    UpdateStudent(String stId) {
        this.stId = stId;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Update Student Detail");
        heading.setBounds(320, 30, 500, 50);
        heading.setFont(new Font("SAN_SERIF", Font.BOLD, 25));
        add(heading);
        
        JLabel labelname = new JLabel("Name");
        labelname.setBounds(50, 150, 150, 30);
        labelname.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelname);
        
        JLabel lblname = new JLabel();
        lblname.setBounds(200, 150, 150, 30);
        add(lblname);
        
        JLabel labeljoining = new JLabel("Year of Joining");
        labeljoining.setBounds(400, 150, 150, 30);
        labeljoining.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeljoining);
        
        tfjoining = new JTextField();
        tfjoining.setBounds(600, 150, 150, 30);
        add(tfjoining);
        
        JLabel labeldob = new JLabel("Date of Birth");
        labeldob.setBounds(50, 200, 150, 30);
        labeldob.setFont(new Font("serif", Font.PLAIN, 20));
        add(labeldob);
        
        JLabel lbldob = new JLabel();
        lbldob.setBounds(200, 200, 150, 30);
        add(lbldob);
        
        JLabel labelyear = new JLabel("Academic Year");
        labelyear.setBounds(400, 200, 150, 30);
        labelyear.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelyear);
        
        tfyear = new JTextField();
        tfyear.setBounds(600, 200, 150, 30);
        add(tfyear);
        
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
        
        tfbranch = new JTextField();
        tfbranch.setBounds(600, 300, 150, 30);
        add(tfbranch);
        
        JLabel labelclubrole = new JLabel("Club Role");
        labelclubrole.setBounds(50, 350, 150, 30);
        labelclubrole.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelclubrole);
        
        tfclubrole = new JTextField();
        tfclubrole.setBounds(200, 350, 150, 30);
        add(tfclubrole);
        
        JLabel labelaadhar = new JLabel("Aadhar Number");
        labelaadhar.setBounds(400, 350, 150, 30);
        labelaadhar.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelaadhar);
        
        JLabel lblaadhar = new JLabel();
        lblaadhar.setBounds(600, 350, 150, 30);
        add(lblaadhar);
        
        JLabel labelstId = new JLabel("Student id");
        labelstId.setBounds(50, 400, 150, 30);
        labelstId.setFont(new Font("serif", Font.PLAIN, 20));
        add(labelstId);
        
        lblstId = new JLabel();
        lblstId.setBounds(200, 400, 150, 30);
        lblstId.setFont(new Font("serif", Font.PLAIN, 20));
        add(lblstId);
        
        try {
            Conn c = new Conn();
            String query = "select * from studentclub where stId = '"+stId+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()) {
                lblname.setText(rs.getString("name"));
                tfjoining.setText(rs.getString("joining"));
                lbldob.setText(rs.getString("dob"));
                tfaddress.setText(rs.getString("address"));
                tfyear.setText(rs.getString("year"));
                tfphone.setText(rs.getString("phone"));
                tfemail.setText(rs.getString("email"));
                tfbranch.setText(rs.getString("branch"));
                lblaadhar.setText(rs.getString("aadhar"));
                lblstId.setText(rs.getString("stId"));
                tfclubrole.setText(rs.getString("clubrole"));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        add = new JButton("Update Details");
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
            String joining = tfjoining.getText();
            String year = tfyear.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String branch = tfbranch.getText();
            String clubrole = tfclubrole.getText();
            
            try {
                Conn conn = new Conn();
                String query = "update studentclub set year = '"+year+"', address = '"+address+"', phone = '"+phone+"', email =  '"+email+"', branch = '"+branch+"', clubrole = '"+clubrole+"' where stId = '"+stId+"'";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Details updated successfully");
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
        new UpdateStudent("");
    }
}
