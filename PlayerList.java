
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class PlayerList
{
    // list of player objects
    private ArrayList<Player> playerList;
 
    /**
     * Constructor for objects of class Player
     */
    public PlayerList() {
        // initialise the player list
        playerList = new ArrayList<>();
    }

    /**
     * Method to add a Player
     * @params name, password
     * @return none
     */
    public void add(String name, String password) {
        Player player = new Player(name, password);
        playerList.add(player);
    }

    /**
     * Method to sort PlayerList
     * @params direction (A - Acsending order, D - Descending order)
     * @return none
     */
    public void sort(char direction) {
        //modify this method to makes it works as expected
        if (direction == 'A') {
            //sort the list in ascending order
            Collections.sort(playerList);
        } else if (direction == 'D')        
        {
            //sort the list in descending order
            Collections.sort(playerList, Collections.reverseOrder());
        }
    }

    /**
     * Method to match a player in the list with a given name and password
     * @param name, password
     * @return true if matched and false if not
     */
    public boolean matchPlayer(String name, String password) {     
        Iterator<Player> iter = playerList.iterator();
        while (iter.hasNext()) {
            Player player = iter.next();
            if(name.equals(player.name) && password.equals(player.name)){
                //System.out.println(name+", "+password);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Method to convert the PlayerList to a string
     * @params none
     * @return a string that represents all players in the list
     */
    @Override
    public String toString() {
        //modify this method to makes it works as expected
        String s = "";
        /*
        for (int i = 0; i < playerList.size(); i++) {
            Player player = playerList.get(i);
                s = s + player.toString() + "\n";
        }
        */
        Iterator<Player> iter = playerList.iterator();
        while (iter.hasNext()) {
            Player player = iter.next();
            s = s + player.toString() + "\n";
        }
        return s;
    }
    
    /**
     * This private class for storing player's details 
     */
    class Player implements Comparable<Player> {
        public String name;
        public String password;
        
        public Player(String name, String password) {
            this.name = name;
            this.password = password;
        }
        
        @Override
        public String toString() {
            return "{name="+name + ", pass=" + password + "}";
        }
 
        @Override
        public int compareTo(Player p) {
            return this.name.compareTo(p.name);
        }
    }
}
