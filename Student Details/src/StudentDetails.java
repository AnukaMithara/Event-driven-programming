import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentDetails extends JFrame  {
    private JPanel StudentDetails;
    private JTextField name;
    private JTextField regNo;
    private JTextField email;
    private JTextField advName;
    private JTextField cCode1;
    private JTextField cName1;
    private JTextField cCredit1;
    private JTextField cCode2;
    private JTextField cName2;
    private JTextField cCredit2;
    private JTextField cCode3;
    private JTextField cName3;
    private JTextField cCredit3;
    private JButton submit;
    private JButton reset;
    private JLabel courseCredtValid;
    private JLabel nameValid;
    private JLabel regValid;
    private JLabel emailValid;
    private JLabel advNameValid;
    private JLabel courseCodeValid;
    private JLabel courseNameValid;

    public StudentDetails() {
        setContentPane(StudentDetails);
        setTitle("Student Details");
        setPreferredSize(new Dimension(900,450));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StudentDetails.this.nameValid.setText("*");
                StudentDetails.this.regValid.setText("*");
                StudentDetails.this.emailValid.setText("*");
                StudentDetails.this.advNameValid.setText("*");
                StudentDetails.this.courseCodeValid.setText("");
                StudentDetails.this.courseNameValid.setText("");
                StudentDetails.this.courseCredtValid.setText("");

                if (cCode1.getText().isEmpty() || cName1.getText().isEmpty()
                        || cCredit1.getText().isEmpty() || cCode2.getText().isEmpty() || cName2.getText().isEmpty()
                        || cCredit2.getText().isEmpty() || cCode3.getText().isEmpty() || cName3.getText().isEmpty()
                        || cCredit3.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all the required fields");
                } else if (!isValidname(name.getText())) {
                            nameValid.setText("Invalid Name");
                } else if (!isValidRegNo(regNo.getText()))  {
                    regValid.setText("Invalid registration number");
                } else if (!isValidEmail(email.getText())) {
                    emailValid.setText("Invalid email");
                } else if (!isValidname(advName.getText())) {
                    advNameValid.setText("Invalid Name");
                } else if (!isValidCourseCode(cCode1.getText()) || !isValidCourseCode(cCode2.getText())
                        || !isValidCourseCode(cCode3.getText())) {
                    courseCodeValid.setText("Invalid Course Code");
                } else if (!isValidCourseName(cName1.getText()) || !isValidCourseName(cName2.getText())
                        || !isValidCourseName(cName3.getText())) {
                    courseNameValid.setText("Invalid Course Name");
                } else if (!isValidCourseCredit(cCredit1.getText()) || !isValidCourseCredit(cCredit2.getText())
                        || !isValidCourseCredit(cCredit3.getText())) {
                    courseCredtValid.setText("Invalid Course Credit");
                } else {
                    String name = StudentDetails.this.name.getText();
                    String regNo = StudentDetails.this.regNo.getText();
                    String email = StudentDetails.this.email.getText();
                    String advName = StudentDetails.this.advName.getText();
                    String cCode1 = StudentDetails.this.cCode1.getText();
                    String cName1 = StudentDetails.this.cName1.getText();
                    String cCredit1 = StudentDetails.this.cCredit1.getText();
                    String cCode2 = StudentDetails.this.cCode2.getText();
                    String cName2 = StudentDetails.this.cName2.getText();
                    String cCredit2 = StudentDetails.this.cCredit2.getText();
                    String cCode3 = StudentDetails.this.cCode3.getText();
                    String cName3 = StudentDetails.this.cName3.getText();
                    String cCredit3 = StudentDetails.this.cCredit3.getText();

                    JOptionPane.showMessageDialog(null, "Successfully Submitted Details");

                    close();
                    DisplayDetails dd = new DisplayDetails(name, regNo, email, advName, cCode1, cName1, cCredit1,
                            cCode2, cName2, cCredit2, cCode3, cName3, cCredit3
                    );
                    dd.setVisible(true);
                }
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StudentDetails.this.name.setText("");
                StudentDetails.this.regNo.setText("");
                StudentDetails.this.email.setText("");
                StudentDetails.this.advName.setText("");
                StudentDetails.this.cCode1.setText("");
                StudentDetails.this.cName1.setText("");
                StudentDetails.this.cCredit1.setText("");
                StudentDetails.this.cCode2.setText("");
                StudentDetails.this.cName2.setText("");
                StudentDetails.this.cCredit2.setText("");
                StudentDetails.this.cCode3.setText("");
                StudentDetails.this.cName3.setText("");
                StudentDetails.this.cCredit3.setText("");
                StudentDetails.this.nameValid.setText("*");
                StudentDetails.this.regValid.setText("*");
                StudentDetails.this.emailValid.setText("*");
                StudentDetails.this.advNameValid.setText("*");
            }
        });
    }

    public void close() {
        this.setVisible(false);
        this.dispose();
    }
    public static void main(String[] args) {
        new StudentDetails();
    }
    public static boolean isValidname(String name)
    {
        if (name == null) {
            return false;
        }
        return name.matches( "^[A-Z](?=.{1,29}$)[A-Za-z]*(?:\\h+[A-Z][A-Za-z]*)*$" );
    }
    public static boolean isValidRegNo(String regNo)
    {
        if (regNo == null) {
            return false;
        }
        return regNo.matches( "^20+[1-9]{2}+\\/+[Ee]{1}+\\/+[0-9]{3}" );
    }
    public static boolean isValidEmail(String email)
    {
        if (email == null) {
            return false;
        }
        return email.matches( "([a-z0-9_.-]+)@([a-z0-9_.-]+)\\.([a-zA-Z]+)" );
    }
    public static boolean isValidCourseCode(String cCode)
    {
        if (cCode == null) {
            return false;
        }
        return cCode.matches( "^[A-Z]{2}+[0-9]{4}" );
    }
    public static boolean isValidCourseCredit(String cCredit)
    {
        if (cCredit == null) {
            return false;
        }
        return cCredit.matches( "^[0-9]{1}" );
    }
    public static boolean isValidCourseName(String cName)
    {
        if (cName == null) {
            return false;
        }
        return cName.matches( "^[a-zA-Z\\s]+" );
    }
}
