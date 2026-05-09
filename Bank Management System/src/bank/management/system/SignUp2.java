package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp2 extends JFrame implements ActionListener{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField t1, t2;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    
    SignUp2(String formno){
        this.formno = formno;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(20, 0, 100, 100);
        add(label);
        
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        l1 = new JLabel("Page 2: Additional Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(290,80,600,30);
        add(l1);
        
        l2 = new JLabel("Religion :");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        l2.setBounds(100,140,100,30);
        add(l2);
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(300, 140, 300, 30);
        add(c1);
       
        l3 = new JLabel("Category :");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 190, 200, 30);
        add(l3);
         
        String category[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(300, 190, 300, 30);
        add(c2);
        
        l4 = new JLabel("Income :");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 240, 200, 30);
        add(l4);
        
        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(300, 240, 300, 30);
        add(c3);
        
        l5 = new JLabel("Educational :");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100, 290, 200, 30);
        add(l5);
        
        l6 = new JLabel("Qualification :");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 315, 200, 30);
        add(l6);
        
        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(300, 315, 300, 30);
        add(c4);
        
        l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 390, 200, 30);
        add(l7);
        
        String occupation[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(300, 390, 300, 30);
        add(c5);
        
        l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 440, 200, 30);
        add(l8);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        t1.setBounds(300, 440, 300, 30);
        add(t1);
        
        l9 = new JLabel("Addhar Number :");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100, 490, 200, 30);
        add(l9);
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        t2.setBounds(300, 490, 300, 30);
        add(t2);
        
        l10 = new JLabel("Sinior Citizen :");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100, 540, 200, 30);
        add(l10);
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300,540,100,30);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450,540,100,30);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        ButtonGroup check = new ButtonGroup();
        check.add(r1);
        check.add(r2);
        
        l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 590, 200, 30);
        add(l11);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.WHITE);
        r3.setBounds(300,590,100,30);
        add(r3);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.WHITE);
        r4.setBounds(450,590,100,30);
        add(r4);
        
        ButtonGroup check1 = new ButtonGroup();
        check1.add(r3);
        check1.add(r4);
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(520, 620, 80, 30);
        b.addActionListener(this); 
        add(b);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(500,120);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
         try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c = new Conn();
                String q1 = "insert into signup22 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c.s.executeUpdate(q1);
                
                new SignUp3(formno).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){
        new SignUp2("").setVisible(true);
    }
}
