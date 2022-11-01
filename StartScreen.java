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


public class StartScreen{
        public static void main(String[] args) {

            JFrame frame = new JFrame("TinkOn");
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

            JButton loginButton = new JButton("Login");
            loginButton.setVisible(true);
            loginButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            loginButton.setBounds(140, 350, 259, 74);
            contentPane.add(loginButton);

            JButton registerButton = new JButton("Register");
            registerButton.setVisible(true);
            registerButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            registerButton.setBounds(140, 434, 259, 74);
            contentPane.add(registerButton);
    }
}
