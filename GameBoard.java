import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

//abstract class for components 
abstract class paintComponents extends Board{

}
// the top level class gameBoard extending the Jpanel
public class GameBoard extends JPanel {    
    int xcells = 30;   // variable or properties declared
    int ycells = 30    ;// variable or properties declared
    int szcell = 10  ;
       
    public GameBoard() {   // this is the constructor

 // this method set the prefered size from above data xcells * szcell, ycells * szcell 
           setPreferredSize(new Dimension(xcells * szcell, ycells * szcell));  
       
     //setBackground(color.black); // this method set the backgroundcolor 

        setFocusable(true);      //necessary to have focus on the gamepanel for listener to detect keystrokes
   
    }

    @Override
    public void paintComponent(Graphics g) {  // this is the process of overriding the method for paint component
        super.paintComponent(g); //paintComponent method  will make sure the background color is painted around the circl
    }

    
}
