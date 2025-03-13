package bank.management.system;

import javax.swing.JFrame;
import java.util.Date;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class mini extends JFrame implements ActionListener {
    String pin;

    JButton button;

    mini(String pin) {
        this.pin = pin;

        getContentPane().setBackground(new Color(207, 216, 220));
        setSize(400, 600);
        setLocation(20, 20);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 200);
        add(label1);

        JLabel label2 = new JLabel("TechCoder A.V");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(150, 20, 200, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        add(label4);

        try {
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '" + pin + "'  ");
            while (resultSet.next()) {
                label3.setText("Card Number : " + resultSet.getString("card_number").substring(0, 4) + "XXX"
                        + resultSet.getString("card_number").substring(7));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {

            int balance = 0;
            Connn c = new Connn();
            ResultSet resultset = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
            while (resultset.next()) {

                label1.setText(label1.getText() + "<html>" + resultset.getString("date")
                        + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultset.getString("type")
                        + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultset.getString("amount") + "<br><br><html>");

                if (resultset.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultset.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultset.getString("amount"));
                }
            }

            label4.setText("Your Total Balance is Rs. " + balance);

        } catch (Exception e) {
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBackground(Color.black);
        button.setForeground(Color.white);
        button.setBounds(20, 500, 100, 25);
        button.addActionListener(this);
        add(button);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }

}
