package comp1110.ass2;

import java.util.Arrays;
import java.util.List;

/**
 * player can do actions:
 * build is put a road,settlement,city,joker on the board
 * trade is use gold to get other resources
 * swap is use joker to change the resources the player get
 *
 * @author Zetian Chen   uid: u7564812
 */
public class Player {
    public String board_state;
    public int[] resource_state;

    public int turn;
    public int[] point = {0 ,0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    public Player() {

    }

    /**
     * Some function to get and set the player's information
     *
     * @auther Zihan Ai (uid: u7528678)
     */

    public void setBoard_state(String bs){
        this.board_state=bs;
    }

    public void setResource_state(int[] rs){
        this.resource_state=rs;
    }

    public String getBoard_state(){
        return this.board_state;
    }
    public int[] getResource_state(){
        return this.resource_state;
    }
    public int getTurn(){return this.turn;}
    public void setTurn(int turn){this.turn = turn; }
    public void setPoint(int turn, int i){this.point[turn] = i;}
    public int[] getPoint(){return this.point;}

    /**
     * To get the type of action according to an Action String.
     *
     * @param action: e.g. "swap 0 1", "build J5", "trade 2"
     * @return: only 3 types: "build", "trade", "swap" (all Strings)
     */
    public String getActionType(String action) {
        return action.split(" ")[0];
    }

    /**
     * To get all the resources which can be traded by 2 gold, i.e. all resources except 5(gold)
     *
     * @return: a list that contains all the resources can be traded by 2 gold.
     */
    public List<String> getTradeResource() {
        String[] trade = {"1", "2", "3", "4", "0"};
        return Arrays.asList(trade);
    }

    /**
     * To get all the resources which can be used to swap, i.e. all resources
     *
     * @return: a list that contains all the resources can be used to swap.
     */
    public List<String> getSwapResource() {
        String[] swap = {"1", "2", "3", "4", "5", "0"};
        return Arrays.asList(swap);
    }

}
