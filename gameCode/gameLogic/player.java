package gameCode.gameLogic;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

import gameCode.game;

public class player extends entity{
    public player(String name) {
        super(name, 20, 5);
        //TODO Auto-generated constructor stub
    }
    
   //player specific functions 

    /*public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerHp(int playerHp) {
        this.playerHp = playerHp;
    }

    public void setPlayerDmg(int playerDmg) {
        this.playerDmg = playerDmg;
    }

    public String getPlayerName(Scanner scan) {
        return scan.nextLine(); 
    }

    public int getPlayerHp() {
        return playerHp;
    }

    public int getPlayerDmg() {
        return playerDmg;
    }

    public void fullHeal() {
        if (playerHp < 20) {
            playerHp = 20;
        }
    }

    public void gameOver(){ 
        if (playerHp == 0) {
            System.out.println("You have died! Ending the game...");

            System.exit(0);
        }
    }*/

    /*public void battleScreen() { // battle screen that will pop up during battle phase
        phase phse = new phase(); 
        game gm = new game();
        player player = new player(name);

        System.out.println(player.name + "\nHP: " + hp);
    
 }*/

}