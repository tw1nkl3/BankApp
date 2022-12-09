import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class StartScreen extends logButtons{
        public static void main(String[] args) throws InterruptedException {
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

            JLabel lblMouseEvent = new JLabel(logM());
            lblMouseEvent.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            lblMouseEvent.setBounds(200, 20, 200, 50);
            contentPane.add(lblMouseEvent);

            String pattern = "MM/dd/yyyy HH:mm";
            DateFormat df = new SimpleDateFormat(pattern);
            Date today = Calendar.getInstance().getTime();        
            String stringDate = df.format(today);

            JLabel lblTime = new JLabel(stringDate);
            lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            lblTime.setBounds(10, 20, 200, 50);
            contentPane.add(lblTime);

            JButton loginButton = new JButton("Login");
            loginButton.setVisible(true);
            loginButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            loginButton.setBounds(140, 350, 259, 74);
            contentPane.add(loginButton);

            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Login log = new Login();
                    log.login();
                    frame.dispose();
                }
            });

            JButton registerButton = new JButton("Register");
            registerButton.setVisible(true);
            registerButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
            registerButton.setBounds(140, 434, 259, 74);
            contentPane.add(registerButton);

            registerButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Registration reg = new Registration();
                    reg.register();
                    frame.dispose();
                }
            });
            
            /* Timer timer = new Timer(100,new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int i;
                    lblTime.setText(String.valueOf(i));
                    if(i==100){
                        timer.stop();
                    }
                    i++;
                }
            }); */
    }
}
