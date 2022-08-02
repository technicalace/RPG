package gameCode.gameLogic;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.plaf.synth.SynthScrollPaneUI;

import gameCode.game;

public class player extends entity{
    public player(String name) {
        super(name, 20, 5, 20, true);
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
    int counter = 3; 

    if (hp <= maxHp) {
        hp = maxHp; 
        System.out.println("You have healed!\nYour HP is now " + hp);
    } else if (hp < maxHp) {
        hp += 3; 
        System.out.println("You have healed up 3 health points!");
        System.out.println("You hp is now " + hp);
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