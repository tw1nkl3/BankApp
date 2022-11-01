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


public class Login{
        public static void main(String[] args) {
            JFrame frame = new JFrame("Login");
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

            JLabel lblEmailAddressUsername = new JLabel("<html>Email address<br/>or username</html>");
            lblEmailAddressUsername.setVisible(true);
            lblEmailAddressUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblEmailAddressUsername.setBounds(58, 315, 300, 60);
            contentPane.add(lblEmailAddressUsername);

            JTextField email_username = new JTextField();
            email_username.setVisible(true);
            email_username.setFont(new Font("Tahoma", Font.PLAIN, 32));
            email_username.setBounds(214, 320, 228, 50);
            contentPane.add(email_username);

            JLabel lblPassword = new JLabel("Password");
            lblPassword.setVisible(true);
            lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
            lblPassword.setBounds(58, 397, 99, 24);
            contentPane.add(lblPassword);

            JPasswordField passwordField = new JPasswordField();
            passwordField.setVisible(true);
            passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
            passwordField.setBounds(214, 390, 228, 50);
            contentPane.add(passwordField);

            JButton btnNewButton = new JButton("Login");
            btnNewButton.setVisible(true);
            btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            btnNewButton.setBounds(140, 700, 259, 74);
            contentPane.add(btnNewButton);
    }
}
