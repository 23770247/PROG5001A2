import java.awt.EventQueue;



/* This [snake Game] is the top level class, containing only the main method. This shall simply
create an instance of GameGUI, invoke its game playing method and print out the
score once the game has finished.*/

// We have a SnakeGame class  extending the frame object
public class SnakeGame extends JFrame {

/*
The public access modifier can be associated with class, method and so on. public can 
be accessed from any other class. Therefore, fields, methods, 
blocks declared inside a public class can be accessed from any class.
*/


public SnakeGame(String gameTille) 
        setTitle(gameTille);{        // this will give the frame title  
        setResizable(false); //The setResizable() method false means we frame is stable
        setLocationRelativeTo(null); // it will add yoy frame in a default location means in a center
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //.EXIT_ON_CLOSE — Exit the application.-add a X button in  your jFrame
        pack();        pack(); // calling the pack() method sizes the frame so that all its contents are at or above their preferred sizes.
    }



  //this is our main method 
    public static void main(String[] args) {        

// An invokeLater() method is a static method of the SwingUtilities class and it can be used to perform a task asynchronously        
EventQueue.invokeLater(() -> {   
 	
            JFrame sgame = new SnakeGame(); //instanciation 
            sgame.setVisible(true);   //.stevisible(true will just show the frame in your screen)

        });
    }
}
