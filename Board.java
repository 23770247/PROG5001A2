import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
 
 
/** Test JTextField, JPasswordField, JFormattedTextField, JTextArea */
@SuppressWarnings("serial")
public class Board extends JFrame {
    
    private String imgCrossFilename = "/resources/snake.png";
 
   // Private variables of the GUI components
   JTextField tField;
   JPasswordField pwField;
   JTextArea tfPanela;
   JFormattedTextField formattedField;
      private Icon iconCross;

 
   /** Constructor to set up all the GUI components */
   public Board() {
    
      
       
      
      // JPanel for the text fields
      JPanel tfPanel = new JPanel(new GridLayout(3, 2, 10, 2));
      tfPanel.setBorder(BorderFactory.createTitledBorder("Text Fields: "));
 
      // Regular text field (Row 1)
      tfPanel.add(new JLabel("  TOP LAYER’s SCORE : "));
      
      // Password field (Row 2)
      tfPanel.add(new JLabel("  CURRENT PLAYER SCORE : "));
     
      // Formatted text field (Row 3)
      tfPanel.add(new JLabel("  PROG5001: 2021 '\n Prabin Baral"));
      
      
      /*
      button.setVerticalAlignment(SwingConstants.BOTTOM);  // of text and icon
      button.setHorizontalAlignment(SwingConstants.RIGHT); // of text and icon
      button.setHorizontalTextPosition(SwingConstants.LEFT); // of text relative to icon
      button.setVerticalTextPosition(SwingConstants.TOP);    // of text relative to icon
      button.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
      button.setBackground(new Color(231, 240, 248));
      button.setForeground(Color.BLUE);
      button.setPreferredSize(new Dimension(150, 80));
  
        */
       
       
      // Create a JTextArea
      JPanel tfPanela = new JPanel(new GridLayout(2, 1, 2, 2));
      tfPanela.setBorder(BorderFactory.createTitledBorder("mainBoards: "));
      tfPanela.setBackground(new Color(204, 11, 11));
      
      

      
 
      // Setup the content-pane of JFrame in BorderLayout
      Container cp = this.getContentPane();
      cp.setLayout(new BorderLayout(10, 10));
      cp.add(tfPanel, BorderLayout.EAST);  
    
    
      
      
      
      ///ImageIcon icon = new ImageIcon("/resources/snake.png");
         //   JLabel label = new JLabel(icon,SwingConstants.CENTER);
            
         // Create a JLabel with text and icon and set its appearances
      
      //label.setPreferredSize(new Dimension(120, 80));
      //cp.add(label);
      /// north maa xa 
      //cp.add(tAreaScrollPane, BorderLayout.CENTER);
       

      
 
      JPanel p2 = new JPanel();
      p2.setBounds(150, 50, 120, 80);
      
       // Regular text field (Row 1)
      p2.add(new JLabel("  GAME OVER "));
      
      // Password field (Row 2)
      p2.add(new JLabel("  Play Again "));
      p2.setAlignmentY(100);
      
      p2.setBackground(Color.BLACK);
      cp.add(p2);
      
      
      
      JPanel tfPane = new JPanel(new GridLayout(3, 2, 10, 2));
       
      JButton button = new JButton(); // use setter to set text and icon
      
      button.setText("QUIT");
      button.addActionListener((event) -> System.exit(0));
      //button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      button.setSize(20,20);
      tfPane.add(button);
      
           
       cp.add(tfPane, BorderLayout.SOUTH);  
      
 
      
          
      
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      setTitle("SNAKE GAME Demo");
      setSize(500, 500);
      setVisible(true);
      
   }
  private void initGameBoard() {
        
        add(new GameBoard());
               
        setResizable(true);
        pack();
        
        setTitle("SNAKEGAME");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
   /** The entry main() method */
   public void mainBoard() {
   

       // Run GUI codes in Event-Dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            new Board();  // Let the constructor do the job
         }
      });
   }
   
}