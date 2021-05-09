import javax.swing.*;
import java.awt.*;

public class mainBoard extends  JFrame {
    private JPanel mainPanel;
    private JButton QuitButton;
    private JLabel textField1;
    private JLabel textField2;
    private JLabel textField3;

    public mainBoard (String title){
       super(title);
           super. setContentPane(mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.mainPanel.setSize(700,500);
        this.pack();
        this.mainPanel.add(textField1);
        this.mainPanel.add(textField2);
        this.mainPanel.add(textField3);
       // this.mainPanel.add(textField4);

        // this.mainPanel.setContentPane().add(textField1);

    }

    public static void main(String [] args)
    {

        JFrame  jf = new mainBoard("My snake Game");
        jf.setVisible(true);


    }
}
