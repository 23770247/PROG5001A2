 
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JOptionPane;
import java.awt.event.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program demonstrates how to use JFrame and LayoutManager.
 * @author Vinh Bui
 */

public class LoginForm extends JFrame implements ActionListener {
    private JLabel labelUsername;
    private JLabel labelPassword;   
    private JTextField textUsername;
    private JPasswordField fieldPassword;
    private JButton buttonLogin;
    private PlayerList playerList;
 
    public LoginForm() {
        super("Login Form");
        labelUsername = new JLabel("Enter username: ");
        labelPassword = new JLabel("Enter password: ");   
        textUsername = new JTextField(20);
        fieldPassword = new JPasswordField(20);
        buttonLogin = new JButton("Login");
        
        // create a new panel with GridBagLayout manager
        JPanel panelLogin = new JPanel(new GridBagLayout());
        
        //use contrains to control the gridbaglayout
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;     
        panelLogin.add(labelUsername, constraints);
 
        constraints.gridx = 1;
        panelLogin.add(textUsername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        panelLogin.add(labelPassword, constraints);
         
        constraints.gridx = 1;
        panelLogin.add(fieldPassword, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        panelLogin.add(buttonLogin, constraints);
                  
        // add the panel to this frame
        add(panelLogin);
         
        pack();
        
        //make the form apprear in the screen centre
        setLocationRelativeTo(null);
        
        //add ActionListener to the button
        buttonLogin.addActionListener(this);
        
        //instantiate the playerList
        playerList = new PlayerList();
        try {
            readPlayerFromFile("players.txt");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File Not Found");
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        String username = textUsername.getText();
        //String password = fieldPassword.getText();
        String password = String.valueOf(fieldPassword.getPassword());
        if (playerList.matchPlayer(username, password)) {
            //initUI();
            new Snake();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "wrong username or password");
        }

    }
    
    private void readPlayerFromFile(String fileName) throws FileNotFoundException{
        Scanner scanner = new Scanner(new File(fileName));
        String userName=null, passWord=null;        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //System.out.println(line);
            String[] key_value = line.split(":", 2);            
            if(key_value[0].equals("Username")){
                userName = key_value[1];
            }
            if(key_value[0].equals("Password")){
                passWord = key_value[1];
            }
        }        
        //System.out.println(userName+", "+passWord);
        //JOptionPane.showMessageDialog(this, userName + ": " + passWord);
        playerList.add(userName, passWord);
        //System.out.println(playerList);
    }
    private void initUI() {    
        /*        
        add(new Board());               
        setResizable(false);
        pack();        
        setTitle("Snake");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}