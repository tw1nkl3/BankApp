import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.util.concurrent.TimeUnit;


public class Registration{
        public static void main(String[] args) {
            JFrame frame = new JFrame("Registration");
            frame.setIconImage(Toolkit.getDefaultToolkit().getImage("bank_icon.png"));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(550, 870);
            frame.setVisible(true);
            frame.setResizable(false);

            JPanel contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            frame.setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel lblNewUserRegister = new JLabel("Welcome to TinkOn bank");
            lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
            lblNewUserRegister.setBounds(45, 52, 460, 50);
            contentPane.add(lblNewUserRegister);

            JLabel lblName = new JLabel("First name");
            lblName.setVisible(true);
            lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblName.setBounds(58, 152, 99, 43);
            contentPane.add(lblName);

            JLabel lblSurname = new JLabel("Last name");
            lblSurname.setVisible(true);
            lblSurname.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblSurname.setBounds(58, 243, 110, 29);
            contentPane.add(lblSurname);

            JLabel lblEmailAddress = new JLabel("Email address");
            lblEmailAddress.setVisible(true);
            lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblEmailAddress.setBounds(58, 324, 124, 36);
            contentPane.add(lblEmailAddress);

            JTextField firstname = new JTextField();
            firstname.setVisible(true);
            firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
            firstname.setBounds(214, 151, 228, 50);
            contentPane.add(firstname);

            JTextField lastname = new JTextField();
            lastname.setVisible(true);
            lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
            lastname.setBounds(214, 235, 228, 50);
            contentPane.add(lastname);

            JTextField email = new JTextField();
            email.setVisible(true);
            email.setFont(new Font("Tahoma", Font.PLAIN, 32));
            email.setBounds(214, 320, 228, 50);
            contentPane.add(email);

            JTextField username = new JTextField();
            username.setVisible(true);
            username.setFont(new Font("Tahoma", Font.PLAIN, 32));
            username.setBounds(214, 397, 228, 50);
            contentPane.add(username);

            JLabel lblUsername = new JLabel("Username");
            lblUsername.setVisible(true);
            lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblUsername.setBounds(58, 405, 99, 29);
            contentPane.add(lblUsername);

            JLabel lblPassword = new JLabel("Password");
            lblPassword.setVisible(true);
            lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblPassword.setBounds(58, 557, 99, 24);
            contentPane.add(lblPassword);

            JLabel lblMobileNumber = new JLabel("Mobile number");
            lblMobileNumber.setVisible(true);
            lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblMobileNumber.setBounds(58, 478, 139, 26);
            contentPane.add(lblMobileNumber);

            JTextField mobile = new JTextField();
            mobile.setVisible(true);
            mobile.setFont(new Font("Tahoma", Font.PLAIN, 32));
            mobile.setBounds(214, 472, 228, 50);
            contentPane.add(mobile);

            JPasswordField passwordField = new JPasswordField();
            passwordField.setVisible(true);
            passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
            passwordField.setBounds(214, 547, 228, 50);
            contentPane.add(passwordField);

            JButton btnNewButton = new JButton("Register");
            btnNewButton.setVisible(true);
            btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            btnNewButton.setBounds(140, 700, 259, 74);
            contentPane.add(btnNewButton);
    }
}
