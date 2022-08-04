package gameCode.gameLogic;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

import gameCode.game;

public class player extends entity{
    public boolean isAlive;
    public int currentPlHp = 20;
    public int counter = 0; 

    public player(String name) {
        super(name, 5, 20, 20, true);
        //TODO Auto-generated constructor stub
        isAlive = true;
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

 public void selfHeal() {
    int counter = 3;
    boolean cntEqZero;

    for (int i = 0; hp < maxHp; i++) {
        i = 3;
        if (counter == 0) {
            cntEqZero = true;
            while(cntEqZero = true) {
                System.out.println("You seem to have used your 3 heals...");
            }
        } else {
            cntEqZero = false;
            while (cntEqZero = false) {
                i += hp;
                System.out.println("You have healed up to 3 points");
                System.out.println("HP: " + hp);
            }
        }
    }
 }

 public void getHpBoost() { 
    phase phse = new phase();

        if (currentPlHp <= maxHp) {
            System.out.println("You have healed 3 health points!");
            counter++;
            currentPlHp += 3; 
            System.out.println("HP: " + currentPlHp);
        } 
       
    }

 

 public boolean isAlive() {
    if (hp != 0) {
        return isalive;
    } else {
        return isalive = false;
    }
 }
}