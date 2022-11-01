
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DisplayDetails extends JFrame {

    private JPanel DisplayDetails;
    private JLabel regNo;
    private JLabel email;
    private JLabel advName;
    private JLabel name;
    private JLabel cName1;
    private JLabel cName2;
    private JLabel cName3;
    private JLabel cCode1;
    private JLabel cCode2;
    private JLabel cCode3;
    private JLabel cCredit1;
    private JLabel cCredit2;
    private JLabel cCredit3;
    private JButton goBackButton;

    public DisplayDetails(String name, String regNo, String email, String advName, String cCode1, String cName1,
                          String cCredit1, String cCode2, String cName2, String cCredit2, String cCode3, String cName3,
                          String cCredit3) {
        setContentPane(DisplayDetails);
        setTitle("Successfully Submitted Details");
        setPreferredSize(new Dimension(900,450));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        this.name.setText(name);
        this.regNo.setText(regNo);
        this.email.setText(email);
        this.advName.setText(advName);
        this.cCode1.setText(cCode1);
        this.cName1.setText(cName1);
        this.cCredit1.setText(cCredit1);
        this.cCode2.setText(cCode2);
        this.cName2.setText(cName2);
        this.cCredit2.setText(cCredit2);
        this.cCode3.setText(cCode3);
        this.cName3.setText(cName3);
        this.cCredit3.setText(cCredit3);


        goBackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                close();
                StudentDetails sd = new StudentDetails();
                sd.setVisible(true);
            }
        });
    }

    public void close() {
        this.setVisible(false);
        this.dispose();
    }





}
