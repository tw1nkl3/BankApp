import java.awt.Font;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HomeScreen {
    public JFrame homeJFrame(){
    //public static void main(String[] args){
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

        String balance = String.format("%.2f", (Math.random()*10000) + 1);

        JLabel lblName = new JLabel("Balance: " + balance);
        lblName.setVisible(true);
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(220, 50, 300, 43);
        contentPane.add(lblName);

        String pattern = "MM/dd/yyyy HH:mm";
        DateFormat df = new SimpleDateFormat(pattern);
        Date today = Calendar.getInstance().getTime();        
        String stringDate = df.format(today);

        JLabel lblTime = new JLabel(stringDate);
        lblTime.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lblTime.setBounds(10, 20, 200, 50);
        contentPane.add(lblTime);

        JLabel lblPhone = new JLabel("<html>Phone number<br/>to transfer money</html>");
        lblPhone.setVisible(true);
        lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPhone.setBounds(48, 310, 300, 60);
        contentPane.add(lblPhone);

        JTextField phone = new JTextField();
        phone.setVisible(true);
        phone.setFont(new Font("Tahoma", Font.PLAIN, 32));
        phone.setBounds(214, 320, 228, 50);
        contentPane.add(phone);

        JButton transferMoney = new JButton("Transfer");
        transferMoney.setVisible(true);
        transferMoney.setFont(new Font("Tahoma", Font.PLAIN, 22));
        transferMoney.setBounds(200, 390, 150, 74);
        contentPane.add(transferMoney);

        return frame;
    }   
}
