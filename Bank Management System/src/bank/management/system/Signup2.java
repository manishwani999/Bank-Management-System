package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, r3, r4;
    JButton next;

    String formno;

    Signup2(String formno) {

        super("APPLICATION FORM");

        // Bank Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image); // image of JLabel

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        l1.setBounds(750, 10, 600, 30);
        add(l1);

        JLabel l2 = new JLabel("ADDITIONAL DETAILS");
        l2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Corbel", Font.BOLD, 18));
        l3.setBounds(100, 150, 100, 30);
        add(l3);

        String religion[] = { "Hindu", "Muslim", "Sikh", "Chistian", "Other" };
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(243, 229, 245));
        comboBox.setFont(new Font("Corbel", Font.BOLD, 14));
        comboBox.setBounds(350, 150, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Corbel", Font.BOLD, 18));
        l4.setBounds(100, 200, 100, 30);
        add(l4);

        String category[] = { "General", "OBC", "SC", "ST", "Other" };
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(243, 229, 245));
        comboBox2.setFont(new Font("Corbel", Font.BOLD, 14));
        comboBox2.setBounds(350, 200, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Corbel", Font.BOLD, 18));
        l5.setBounds(100, 250, 100, 30);
        add(l5);

        String income[] = { "No Income", "< 1,50,000", "< 2,50,000", "5,00,000", "Up to 10,00,000", "Above 10,00,000" };
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(243, 229, 245));
        comboBox3.setFont(new Font("Corbel", Font.BOLD, 14));
        comboBox3.setBounds(350, 250, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Corbel", Font.BOLD, 18));
        l6.setBounds(100, 300, 200, 30);
        add(l6);

        String educational[] = { "Non Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other" };
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(new Color(243, 229, 245));
        comboBox4.setFont(new Font("Corbel", Font.BOLD, 14));
        comboBox4.setBounds(350, 300, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Corbel", Font.BOLD, 18));
        l7.setBounds(100, 350, 200, 30);
        add(l7);

        String occupation[] = { "Salaried", "Self-emplayed", "House Wife", "Business", "Student", "Retired", "Other" };
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(243, 229, 245));
        comboBox5.setFont(new Font("Corbel", Font.BOLD, 14));
        comboBox5.setBounds(350, 350, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number :");
        l8.setFont(new Font("Corbel", Font.BOLD, 18));
        l8.setBounds(100, 400, 200, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Corbel", Font.BOLD, 14));
        textPan.setBounds(350, 400, 320, 30);
        textPan.setBorder(null);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number :");
        l9.setFont(new Font("Corbel", Font.BOLD, 18));
        l9.setBounds(100, 450, 200, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Corbel", Font.BOLD, 14));
        textAadhar.setBounds(350, 450, 320, 30);
        textAadhar.setBorder(null);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Corbel", Font.BOLD, 18));
        l10.setBounds(100, 500, 200, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Corbel", Font.BOLD, 14));
        r1.setBounds(350, 500, 100, 30);
        r1.setBackground(new Color(243, 229, 245));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Corbel", Font.BOLD, 14));
        r2.setBounds(450, 500, 100, 30);
        r2.setBackground(new Color(243, 229, 245));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Corbel", Font.BOLD, 18));
        l11.setBounds(100, 550, 200, 30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Corbel", Font.BOLD, 14));
        r3.setBounds(350, 550, 100, 30);
        r3.setBackground(new Color(243, 229, 245));
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Corbel", Font.BOLD, 14));
        r4.setBounds(450, 550, 100, 30);
        r4.setBackground(new Color(243, 229, 245));
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);

        JLabel l12 = new JLabel("Form No :");
        l12.setFont(new Font("Corbel", Font.BOLD, 14));
        l12.setBounds(650, 40, 80, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Corbel", Font.BOLD, 14));
        l13.setBounds(720, 40, 50, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Corbel", Font.BOLD, 18));
        next.setBackground(new Color(206, 147, 216));
        next.setForeground(Color.BLACK);
        next.setBorder(null);
        next.setBounds(600, 600, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 750);
        setLocation(350, 30);
        getContentPane().setBackground(new Color(243, 229, 245));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = null;
        if ((r1.isSelected())) {
            scitizen = "Yes";
        } else if ((r2.isSelected())) {
            scitizen = "No";
        }

        String eaccount = null;
        if ((r3.isSelected())) {
            eaccount = "Yes";
        } else if ((r4.isSelected())) {
            eaccount = "No";
        }

        try {

            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields.");
            } else if (textAadhar.getText().matches("[a-zA-Z]+")) {
                JOptionPane.showMessageDialog(null, "Enter valid Aadhar number. Only numbers are allowed.");
            } else {
                Connn c1 = new Connn();
                String q = "insert into Signuptwo values('" + formno + "','" + rel + "', '" + cate + "', '" + inc
                        + "', '" + edu + "', '" + occ + "', '" + pan + "', '" + aadhar + "', '" + scitizen + "', '"
                        + eaccount + "')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup2("");
    }

}
