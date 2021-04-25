import java.awt.EventQueue;
import javax.swing.*;

public class VB_Snake extends JFrame  {

    public SnakeGame(String gameTitle) {        
        setTitle(gameTitle);
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        LoginForm.main(null);
       
    }
    
    public static void main(String[] args) {        
        
            //create the game with a game title as follow: The Snake Game (C) Your_Name
            JFrame sgame = new SnakeGame("The Snake Game (C) Prabin");
            //sgame.setVisible(false);
            
           
    }
}
