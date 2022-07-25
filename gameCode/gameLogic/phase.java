package gameCode.gameLogic;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TimerTask;

import gameCode.game;

public class phase extends game{
    game gm = new game(); 
    public int enemyNum;
    public String enemyName;
    // PLAINS ENEMIES 
    enemy plainsEnmy1 = new enemy("Ferioucious Bull","You see something big in the distance...", "Ears are blowing steam!", 6, 21, 21);
    enemy plainsEnemy2 = new enemy("Clever Moose","Constantly plotting... ", "You hear something rustle in the tall grass...", 4, 19, 19);
    enemy plainsEnemy3 = new enemy("Obnoxious Bird","KAWWWK KAWWWK", "You see something soar in the sky...", 5, 16, 16);
    // TUNDRA ENEMIES
    enemy tundraEnemy1 = new enemy("Living Ice Mound", "Jumpy and crunchy!", "You feel the ground on your feet lower...", 3, 13, 13);
    enemy tundraEnemy2 = new enemy("Frantic Whale", "It's huge!", "A frozen lake seprates you and the other side of the land, something starts to lift up...", 7, 16, 16);
    enemy tundraEnemy3 = new enemy("Magic Raindeer", "Magical properties, never attacks directly.", "You hear prancing and a bright light in the distance getting closer...", 6, 15, 15);
    // FOREST ENEMIES 
    enemy forestEnemy1 = new enemy("Living Vine", "Always growing.", "You step on a vine, it moved!", 6, 18, 18);
    enemy forestEnemy2 = new enemy("Raging Monkey", "Head is steaming!", "You hear branches crack from above...", 7, 17, 17);
    enemy forestEnemy3 = new enemy("Green Slime", "Goopy", "You see slime drip from the tree... it starts to fall into a blob.",4, 24, 24);
    // DUNWA ENEMIES
    enemy dunesEnemy1 = new enemy("Fericoucious Vulture", "Looking to pick a fight.", "You see a soaring shadow block the blazing sun...", 7, 16, 16);
    enemy dunesEnemy2 = new enemy("Cheeky Possum", "Scraubling around.", "You hear pitter patter on the floor...", 7, 15, 15);
    enemy dunesEnemy3 = new enemy("Giant Sand Worm", "Slithering around.", "You feel the ground shift under your feet...", 9, 19, 19);

    // BATTLE PHASES 
    public void battlePlains() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int bttleChce;

        game gm = new game();
        player pl = new player(super.name);

        String[] plainsEnemies = {"Bull", "Moose", "Bird"};

        int randEnemy = rand.nextInt(plainsEnemies.length); 

        if (randEnemy == 0) {
            enemyNum = 1; 
        } else if (randEnemy == 1) {
            enemyNum = 2;
        } else if (randEnemy == 2) {
            enemyNum = 3;
        }
        
        switch(randEnemy) {
            case 0: 
                System.out.println(plainsEnmy1.getEnemyIntro());
                System.out.println("The " + plainsEnmy1.getEnemyName() + " attacks!\n==========");
                enemyName = "Bull";

                gm.battleScreen();
                break;
            case 1: 
                System.out.println(plainsEnemy2.getEnemyIntro());
                System.out.println("The " + plainsEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Moose";
               
                gm.battleScreen();
                break;
            case 2: 
                System.out.println(plainsEnemy3.getEnemyIntro());
                System.out.println("The " + plainsEnemy3.getEnemyName() + " attacks!\n==========");
                enemyName = "Bird";

                gm.battleScreen();
                break;
        }             
    }

    public void battleTundra() {
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in); 

        game gm = new game();
        player pl = new player(super.name);

        String[] tundraEnemies = {"Ice Mound", "Whale", "Raindeer"};

        int randEnemy = rand.nextInt(tundraEnemies.length); 

        if (randEnemy == 0) {
            enemyNum = 4; 
        } else if (tundraEnemies.equals(tundraEnemy2)) {
            enemyNum = 5; 
        } else if (tundraEnemies.equals(tundraEnemy3)) {
            enemyNum = 6; 
        }

        switch (randEnemy) {
            case 0: 
                System.out.println(tundraEnemy1.getEnemyIntro());
                System.out.println("The " + tundraEnemy1.getEnemyName() + " attacks!\n==========");
                enemyName = "Mound"; 

                gm.battleScreen();
                break; 
            case 1: 
                System.out.println(tundraEnemy2.getEnemyIntro());
                System.out.println("The " + tundraEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Whale";
                
                gm.battleScreen();
                break; 
            case 2: 
                System.out.println(tundraEnemy3.getEnemyIntro());
                System.out.println("The " + tundraEnemy3.getEnemyName() + " attacks!\n==========");
                enemyName = "Raindeer"; 

                gm.battleScreen();
                break;
        }
    }

    public void battleForest() {
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in); 

        game gm = new game(); 
        player pl = new player(super.name); 

        String[] forestEnemies = {"Vine", "Monkey", "Slime"}; 

        int randEnemy = rand.nextInt(forestEnemies.length); 

        if (forestEnemies.equals(forestEnemy1)) {
            enemyNum = 7; 
        } else if (forestEnemies.equals(forestEnemy2)) {
            enemyNum = 8; 
        } else if (forestEnemies.equals(forestEnemy3)) {
            enemyNum = 9;
        }

        switch (randEnemy) {
            case 0: 
                System.out.println(forestEnemy1.getEnemyIntro());
                System.out.println("The " + forestEnemy1.getEnemyName() + " attacks!\n==========");
                enemyName = "Vine";

                gm.battleScreen();
                break; 
            case 1: 
                System.out.println(forestEnemy2.getEnemyIntro());
                System.out.println("The " + forestEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Monkey";

                gm.battleScreen();
                break; 
            case 2: 
                System.out.println(forestEnemy3.getEnemyIntro());
                System.out.println("the " + forestEnemy3.getEnemyName() + " attacks\n==========");
                enemyName = "Slime";

                gm.battleScreen(); 
                break; 
        }
     }

    public void battleDunes() {
        Random rand = new Random(); 
        Scanner scan = new Scanner(System.in); 

        game gm = new game(); 
        player pl = new player(super.name); 

        String[] dunesEnemies = {"Vulture", "Possum", "Worm"}; 

        int randEnemy = rand.nextInt(dunesEnemies.length); 

        if (dunesEnemies.equals(dunesEnemy1)) {
            enemyNum = 10; 
        } else if (dunesEnemies.equals(dunesEnemy2)) {
            enemyNum = 11; 
        } else if (dunesEnemies.equals(dunesEnemy3)) {
            enemyNum = 12;
        }

        switch (randEnemy) {
            case 0: 
                System.out.println(dunesEnemy1.getEnemyIntro());
                System.out.println("The " + dunesEnemy1.getEnemyName() + " attacks!\n==========");
                enemyName = "Vulture";

                gm.battleScreen(); 
                break; 
            case 1: 
                System.out.println(dunesEnemy2.getEnemyIntro());
                System.out.println("The " + dunesEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Possum";

                gm.battleScreen();
                break; 
            case 2: 
                System.out.println(dunesEnemy3.getEnemyIntro());
                System.out.println(dunesEnemy3.getEnemyName() + " attacks!\n======");
                enemyName = "Worm";

                gm.battleScreen();
                break; 
        }
    }

    public void playerAttack() {
        player pl = new player(super.name); 

        System.out.println("You have attacked!");
        System.out.println("-" + pl.dmg);
        switch (enemyName) {
            case "Bull": 
                // PLAINS ENEMIES
                plainsEnmy1.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + plainsEnmy1.getEnemyHealth());
                break;
            case "Moose": 
                plainsEnemy2.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + plainsEnemy2.getEnemyHealth());
                break; 
            case "Bird": 
                plainsEnemy3.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + plainsEnemy3.getEnemyHealth());
                break;
            case "Mound": 
                // TUNDRA ENEMIES 
                tundraEnemy1.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + tundraEnemy1.getEnemyHealth());
                break;
            case "Whale":
                tundraEnemy2.enemHp -= pl.dmg; 
             
                System.out.println("Enemy HP: " + tundraEnemy2.getEnemyHealth());
                break;
            case "Raindeer":
                tundraEnemy3.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + tundraEnemy3.getEnemyHealth());
                break;
            case "Vine":
                // FOREST ENEMIES
                forestEnemy1.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + forestEnemy1.getEnemyHealth());
                break; 
            case "Monkey": 
                forestEnemy2.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + forestEnemy2.getEnemyHealth());
                break; 
            case "Slime": 
                forestEnemy3.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + forestEnemy3.getEnemyName());
                break; 
            case "Vulture": 
                // DUNES ENEMIES 
                dunesEnemy1.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + dunesEnemy1.getEnemyHealth());
                break; 
            case "Possum": 
                dunesEnemy2.enemHp -= pl.dmg; 

                System.out.println();
            case "Worm": 
                dunesEnemy3.enemHp -= pl.dmg; 

                System.out.println("Enemy HP: " + dunesEnemy3.getEnemyHealth());
                break;
        }
    }

    public void enemyAttack() {
        player pl = new player(super.name);

        switch (enemyNum) {
            // PLAINS ENEMIES 
            case 1: 
                System.out.println(plainsEnmy1.getEnemyName() + " attacks!");
                System.out.println("-" + plainsEnmy1.getEnemyDmg());

                pl.hp -= plainsEnmy1.enemDmg;

                System.out.println("HP: " + pl.hp);
                break;
            case 2: 
                System.out.println(plainsEnemy2.getEnemyName() + " attacks!");
                System.out.println("-" + plainsEnemy2.enemDmg);

                pl.hp -= plainsEnemy2.enemDmg;

                System.out.println("HP: " + pl.hp);
                break; 
            case 3: 
                System.out.println(plainsEnemy3.getEnemyName());
                System.out.println("-" + plainsEnemy3.enemDmg);

                pl.hp -= plainsEnemy3.enemDmg;
                break; 
            // TUNDRA ENEMIES
            case 4: 
                System.out.println(tundraEnemy1.getEnemyName() + " attacks!");
                System.out.println("-" + tundraEnemy1.getEnemyDmg());

                pl.hp -= tundraEnemy1.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            }
    }
}
