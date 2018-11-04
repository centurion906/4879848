import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    Container cp;
    private JButton jbtn = new JButton("ENTER");
    private JButton jbtn1 = new JButton("EXIT");
    private JLabel jlb = new JLabel("");
    private String methodStr[] = {"水瓶座","雙魚座", "牡羊座", "金牛座", "雙子座","巨蠍座","獅子座","處女座","天秤座","天蠍座","射手座","魔羯座"};
    private JComboBox jcb = new JComboBox<String>(methodStr);
    public MainFrame() {
        ex();
    }
    private void ex() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 200);
        this.add(jbtn);
        this.add(jbtn1);
        this.add(jcb);
        this.add(jlb);
        this.setLayout(null);
        jcb.setBounds(0,0,100,50);
        jbtn.setBounds(110,0,100,50);
        jbtn1.setBounds(230,0,100,50);
        jlb.setBounds(100,75,200,50);
        jbtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (jcb.getSelectedIndex()){
                    case 0:
                        jlb.setText("1/20~2/18");
                        break;
                    case 1:
                        jlb.setText("2/19~3/20");
                        break;
                    case 2:
                        jlb.setText("3/21~4/19");
                        break;
                    case 3:
                        jlb.setText("4/20~5/20");
                        break;
                    case 4:
                        jlb.setText("5/21~6/20");
                        break;
                    case 5:
                        jlb.setText("6/21~7/22");
                        break;
                    case 6:
                        jlb.setText("7/23~8/22");
                        break;
                    case 7:
                        jlb.setText("8/23~9/22");
                        break;
                    case 8:
                        jlb.setText("9/23~10/22");
                        break;
                    case 9:
                        jlb.setText("10/23~11/21");
                        break;
                    case 10:
                        jlb.setText("11/22~12/21");
                        break;
                    case 11:
                        jlb.setText("12/22~1/19");
                        break;
                }
            }
        });
    }
}
