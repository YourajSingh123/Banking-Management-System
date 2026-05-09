package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    
    String pin;
    Deposit(String pin){
        this.pin = pin;
        
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 700, 700);
        add(l2);
        
        l1 = new JLabel("ENTER AMOUNT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(135,220,300,35);
        l2.add(l1);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 22));
        t1.setBounds(122,260,280,25);
        l2.add(t1);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(250,350,150,30);
        l2.add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(250,390,150,30);
        l2.add(b2);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setSize(700, 700);
        setLocation(200, 0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         try{        
            String amount = t1.getText();
            Date date = new Date();
            if(ae.getSource()==b1){
                if(t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
            }else if(ae.getSource()==b2){
                setVisible(false);
                new Transactions(pin).setVisible(true);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String []args){
        new Deposit("").setVisible(true);
    }
}
