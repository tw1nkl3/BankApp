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

public class Login extends JFrame{
    private JPanel contentPane;
    private JTextField username_mobile;
    private JPasswordField passwordField;
    private JButton loginButton;

    public static void main(String[] args){
        try {
            Login frame = new Login();
            frame.setSize(550, 870);
            frame.setVisible(true);
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    };

    public Login(){
        setIconImage(Toolkit.getDefaultToolkit().getImage("bank_icon.png"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 550, 870);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblUserLogin = new JLabel("Welcome to TinkOn bank");
        lblUserLogin.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblUserLogin.setBounds(45, 52, 460, 50);
        contentPane.add(lblUserLogin);

        JLabel lblEmailAddress = new JLabel("Username or Mobile");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 250, 250, 36);
        contentPane.add(lblEmailAddress);

        username_mobile = new JTextField();
        username_mobile.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username_mobile.setBounds(260, 245, 228, 50);
        contentPane.add(username_mobile);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(58, 330, 99, 24);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(260, 320, 228, 50);
        contentPane.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        loginButton.setBounds(170, 700, 200, 74);
        contentPane.add(loginButton);
    }
}
