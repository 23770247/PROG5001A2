import java.awt.*; 
import java.awt.EventQueue;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Snake extends JFrame  {
    JPanel panel_1;
    JPanel panel_2;
    JLabel lblCurrentUser;
    JLabel lblCurrentScore;
    JLabel lblHighScore;
    
    public Snake() {        
        initUI();
    }
    
    private void initUI() {  
        lblCurrentUser = new JLabel("Current User : ");
        lblCurrentScore = new JLabel("Current Score : ");
        lblHighScore = new JLabel("Highest Score : ");
        
        panel_1= new JPanel(new GridLayout(3, 2, 10, 2));
        panel_1.setSize(250, 350);
        panel_1.setLayout(new GridLayout(3,1));
        panel_1.add(lblCurrentUser);
        panel_1.add(lblCurrentScore);
        panel_1.add(lblHighScore);
        
        panel_2= new JPanel(new GridLayout(3, 2, 10, 2));
        panel_2.setSize(50, 50);
        JButton button = new JButton();
        button.setText("Start");
        panel_2.add(button);
         button.addActionListener((event) -> initUI());

        
        /*Button button2 = new JButton();
        button2.setText("Pause");
        panel_2.add(button2);
         button2.addActionListener((event) -> System.exit(1));
            */
         
        JButton button3 = new JButton();
        button3.setText("QUIT");
        panel_2.add(button3);
         button3.addActionListener((event) -> System.exit(0));

        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(500, 350);
        setLayout(new BorderLayout());
        
        add(new Board(), BorderLayout.WEST);
        add(panel_1, BorderLayout.EAST);
        add(panel_2, BorderLayout.SOUTH);
        
        setResizable(false);
        pack();                
        setVisible(true);
    }    
}