package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4, r5;

    JButton next;

    JTextField textName, textFname, textEmail, textAddress, textCity, textPin, textState;

    JDateChooser dateChooser;

    // Random Form number generator
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    // =============================================================================================
    Signup() {
        super("APPLICATION FORM");

        // ============================================================================
        // Bank Image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image); // image of JLabel

        // ================================================================
        // Title => Application Form
        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 50, 600, 40);
        label1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 38));
        add(label1);

        // Title => Page 1
        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
        label2.setBounds(750, 10, 600, 30);
        add(label2);

        // Title => Personal Details
        JLabel label3 = new JLabel("PERSONAL DETAILS");
        label3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
        label3.setBounds(320, 100, 600, 30);
        add(label3);

        // Title => Name
        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Corbel", Font.BOLD, 20));
        labelName.setBounds(100, 190, 200, 30);
        add(labelName);

        // Input for Name
        textName = new JTextField();
        textName.setFont(new Font("Corbel", Font.BOLD, 18));
        textName.setBounds(300, 190, 400, 30);
        textName.setBorder(null);
        add(textName);

        // Title => Fathers Name
        JLabel labelfName = new JLabel("Father's Name :");
        labelfName.setFont(new Font("Corbel", Font.BOLD, 20));
        labelfName.setBounds(100, 230, 200, 30);
        add(labelfName);

        // Input for Father's Name
        textFname = new JTextField();
        textFname.setFont(new Font("Corbel", Font.BOLD, 18));
        textFname.setBounds(300, 230, 400, 30);
        textFname.setBorder(null);
        add(textFname);

        // DOB
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Corbel", Font.BOLD, 20));
        DOB.setBounds(100, 270, 200, 30);
        add(DOB);

        // insert calender
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 270, 400, 30);
        dateChooser.setBorder(null);
        add(dateChooser);

        // Gender
        JLabel labelG = new JLabel("Gender : ");
        labelG.setFont(new Font("Corbel", Font.BOLD, 20));
        labelG.setBounds(100, 310, 200, 30);
        add(labelG);

        // Male
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Corbel", Font.BOLD, 20));
        r1.setBounds(300, 310, 100, 30);
        r1.setBackground(new Color(251, 233, 231));
        add(r1);

        // Female
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Corbel", Font.BOLD, 20));
        r2.setBounds(400, 310, 100, 30);
        r2.setBackground(new Color(251, 233, 231));
        add(r2);

        // Other
        r3 = new JRadioButton("Other");
        r3.setFont(new Font("Corbel", Font.BOLD, 20));
        r3.setBounds(520, 310, 100, 30);
        r3.setBackground(new Color(251, 233, 231));
        add(r3);

        // Group the buttons for any one tick
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);

        // Email
        JLabel labelEmail = new JLabel("Email :");
        labelEmail.setFont(new Font("Corbel", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        labelEmail.setBorder(null);
        add(labelEmail);

        // Input Email
        textEmail = new JTextField();
        textEmail.setFont(new Font("Corbel", Font.BOLD, 18));
        textEmail.setBounds(300, 350, 400, 30);
        textEmail.setBorder(null);
        add(textEmail);

        // Marital Status
        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Corbel", Font.BOLD, 20));
        labelMs.setBounds(100, 390, 200, 30);
        labelMs.setBorder(null);
        add(labelMs);

        // Marital Status input
        // Married
        r4 = new JRadioButton("Married");
        r4.setFont(new Font("Corbel", Font.BOLD, 20));
        r4.setBounds(300, 390, 100, 30);
        r4.setBackground(new Color(251, 233, 231));
        add(r4);

        // Unmarried
        r5 = new JRadioButton("Unmarried");
        r5.setFont(new Font("Corbel", Font.BOLD, 20));
        r5.setBounds(420, 390, 200, 30);
        r5.setBackground(new Color(251, 233, 231));
        add(r5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);

        // Address
        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setFont(new Font("Corbel", Font.BOLD, 20));
        labelAddress.setBounds(100, 430, 200, 30);
        labelAddress.setBorder(null);
        add(labelAddress);

        // Address input
        textAddress = new JTextField();
        textAddress.setFont(new Font("Corbel", Font.BOLD, 18));
        textAddress.setBounds(300, 430, 400, 30);
        textAddress.setBorder(null);
        add(textAddress);

        // City
        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Corbel", Font.BOLD, 20));
        labelCity.setBounds(100, 470, 200, 30);
        labelCity.setBorder(null);
        add(labelCity);

        // City input
        textCity = new JTextField();
        textCity.setFont(new Font("Corbel", Font.BOLD, 18));
        textCity.setBounds(300, 470, 165, 30);
        textCity.setBorder(null);
        add(textCity);

        // State
        JLabel labelState = new JLabel("State :");
        labelState.setFont(new Font("Corbel", Font.BOLD, 20));
        labelState.setBounds(470, 470, 100, 30);
        labelState.setBorder(null);
        add(labelState);

        // State input
        textState = new JTextField();
        textState.setFont(new Font("Corbel", Font.BOLD, 18));
        textState.setBounds(540, 470, 160, 30);
        textState.setBorder(null);
        add(textState);

        // Pincode
        JLabel labelPin = new JLabel("Pincode :");
        labelPin.setFont(new Font("Corbel", Font.BOLD, 20));
        labelPin.setBounds(100, 510, 200, 30);
        labelPin.setBorder(null);
        add(labelPin);

        // Pincode input
        textPin = new JTextField();
        textPin.setFont(new Font("Corbel", Font.BOLD, 18));
        textPin.setBounds(300, 510, 400, 30);
        textPin.setBorder(null);
        add(textPin);

        next = new JButton("Next");
        next.setFont(new Font("Corbel", Font.BOLD, 18));
        next.setBackground(new Color(229, 115, 115));
        next.setForeground(Color.black);
        next.setBorder(null);
        next.setBounds(600, 580, 100, 30);
        next.addActionListener(this);
        add(next);

        // Background Color
        getContentPane().setBackground(new Color(251, 233, 231));
        setLayout(null);
        setSize(850, 700);
        setLocation(350, 30);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";

        } else if (r2.isSelected()) {
            gender = "Female";
        } else if (r3.isSelected()) {
            gender = "Other";
        }
        String email = textEmail.getText();
        String marital = null;
        if (r4.isSelected()) {
            marital = "Married";

        } else if (r5.isSelected()) {
            marital = "Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Connn con1 = new Connn();
                String q = "insert into signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','"
                        + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + pincode
                        + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);

            }

        } catch (Exception E) {
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
