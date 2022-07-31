package gameCode.gameLogic;

import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.plaf.synth.SynthScrollBarUI;

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
    // DUNES ENEMIES
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

        String[] plainsEnemies= {"Bull", "Moose", "Bird"};

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

                battleScreen();
                break;
            case 1: 
                System.out.println(plainsEnemy2.getEnemyIntro());
                System.out.println("The " + plainsEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Moose";
               
                battleScreen();
                break;
            case 2: 
                System.out.println(plainsEnemy3.getEnemyIntro());
                System.out.println("The " + plainsEnemy3.getEnemyName() + " attacks!\n==========");
                enemyName = "Bird";

                battleScreen();
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

                battleScreen();
                break; 
            case 1: 
                System.out.println(tundraEnemy2.getEnemyIntro());
                System.out.println("The " + tundraEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Whale";
                
                battleScreen();
                break; 
            case 2: 
                System.out.println(tundraEnemy3.getEnemyIntro());
                System.out.println("The " + tundraEnemy3.getEnemyName() + " attacks!\n==========");
                enemyName = "Raindeer"; 

                battleScreen();
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

                battleScreen();
                break; 
            case 1: 
                System.out.println(forestEnemy2.getEnemyIntro());
                System.out.println("The " + forestEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Monkey";

                battleScreen();
                break; 
            case 2: 
                System.out.println(forestEnemy3.getEnemyIntro());
                System.out.println("the " + forestEnemy3.getEnemyName() + " attacks\n==========");
                enemyName = "Slime";

                battleScreen(); 
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

                battleScreen(); 
                break; 
            case 1: 
                System.out.println(dunesEnemy2.getEnemyIntro());
                System.out.println("The " + dunesEnemy2.getEnemyName() + " attacks!\n==========");
                enemyName = "Possum";

                battleScreen();
                break; 
            case 2: 
                System.out.println(dunesEnemy3.getEnemyIntro());
                System.out.println(dunesEnemy3.getEnemyName() + " attacks!\n======");
                enemyName = "Worm";

                battleScreen();
                break; 
        }
    }

    // BATTLE FUNCTIONS 
    TimerTask enemyAttacking = new TimerTask() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            enemyAttack();
        }
        
    };

    TimerTask enemyHealing = new TimerTask() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            enemyHeal();
        }
        
    };

    TimerTask playerAttacking = new TimerTask() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            playerAttack();
        }
        
    };

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
            case 1: 
                 // PLAINS ENEMIES 
                System.out.println(plainsEnmy1.getEnemyName() + " attacks!");
                System.out.println("-" + plainsEnmy1.getEnemyDmg());

                pl.hp -= plainsEnmy1.enemDmg;

                System.out.println("HP: " + pl.hp);
                break;
            case 2: 
                System.out.println(plainsEnemy2.getEnemyName() + " attacks!");
                System.out.println("-" + plainsEnemy2.getEnemyDmg());

                pl.hp -= plainsEnemy2.enemDmg;

                System.out.println("HP: " + pl.hp);
                break; 
            case 3: 
                System.out.println(plainsEnemy3.getEnemyName() + " attacks!");
                System.out.println("-" + plainsEnemy3.getEnemyDmg());

                pl.hp -= plainsEnemy3.enemDmg;

                System.out.println("HP: " + pl.hp);
                break; 
            case 4: 
                // TUNDRA ENEMIES
                System.out.println(tundraEnemy1.getEnemyName() + " attacks!");
                System.out.println("-" + tundraEnemy1.getEnemyDmg());

                pl.hp -= tundraEnemy1.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            case 5: 
                System.out.println(tundraEnemy2.getEnemyName() + " attacks!");
                System.out.println("-" + tundraEnemy2.getEnemyDmg());

                pl.hp -= tundraEnemy2.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            case 6: 
                System.out.println(tundraEnemy3.getEnemyName() + " attacks!");
                System.out.println("-" + tundraEnemy3.getEnemyDmg());

                pl.hp -= tundraEnemy3.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break;
            case 7: 
                // FOREST ENEMIES 
                System.out.println(forestEnemy1.getEnemyName() + " attacks!");
                System.out.println("-" + forestEnemy1.getEnemyDmg());

                pl.hp -= forestEnemy1.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            case 8: 
                System.out.println(forestEnemy2.getEnemyName() + " attacks!");
                System.out.println("-" + forestEnemy2.getEnemyDmg());

                pl.hp -= forestEnemy2.enemDmg; 

                System.out.println("HP " + pl.hp);
                break;
            case 9: 
                System.out.println(forestEnemy3.getEnemyName() + " attacks!");
                System.out.println("-" + forestEnemy3.getEnemyDmg());

                pl.hp -= forestEnemy3.enemDmg;

                System.out.println("HP: " + pl.hp);
                break; 
            case 10: 
                // DUNES ENEMIES 
                System.out.println(dunesEnemy1.getEnemyName() + " attacks!");
                System.out.println("-" + forestEnemy2.getEnemyDmg());

                pl.hp -= dunesEnemy1.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            case 11: 
                System.out.println(dunesEnemy2.getEnemyName() + " attacks!");
                System.out.println("-" + dunesEnemy2.getEnemyDmg());

                pl.hp -= dunesEnemy2.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            case 12: 
                System.out.println(dunesEnemy3.getEnemyName() + " attacks!");
                System.out.println("-" + dunesEnemy3.getEnemyDmg());

                pl.hp -= dunesEnemy3.enemDmg; 

                System.out.println("HP: " + pl.hp);
                break; 
            }
    }

    public void enemyHeal() {
        int currentHp; // enemy hp 

        switch (enemyNum) {
            case 1: 
                // PLAINS ENEMIES 
                System.out.println(plainsEnmy1.getEnemyName() + " heals!\n+1");
                if (plainsEnmy1.enemHp == plainsEnmy1.emaxHp) {
                    System.out.println("The bull maxes out!");
                    plainsEnmy1.enemHp = plainsEnmy1.emaxHp;
                    System.out.println(plainsEnmy1.getEnemyName() + "'s HP: " + plainsEnmy1.getEnemyHealth());
                } else {
                    currentHp = (plainsEnmy1.enemHp + 1); 
                    System.out.println(plainsEnmy1.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 2: 
                System.out.println(plainsEnemy2.getEnemyName() + " heals!\n+1");
                if (plainsEnemy2.enemHp == plainsEnemy2.emaxHp) {
                    System.out.println("The moose maxes out!");
                    plainsEnemy2.enemHp = plainsEnemy2.emaxHp; 
                    System.out.println(plainsEnemy2.getEnemyName() + "'s HP: " + plainsEnemy2.getEnemyHealth());
                } else {
                    currentHp = (plainsEnemy2.enemHp + 1); 
                    System.out.println(plainsEnemy2.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 3: 
                System.out.println(plainsEnemy3.getEnemyName() + " heals!\n+1");
                if (plainsEnemy3.enemHp == plainsEnemy3.emaxHp) {
                    System.out.println("The Bird maxes out!");
                    plainsEnemy3.enemHp = plainsEnemy3.emaxHp; 
                    System.out.println(plainsEnemy3.getEnemyName() + "'s HP: " + plainsEnemy3.getEnemyHealth());
                } else {
                    currentHp = (plainsEnemy3.enemHp + 1);
                    System.out.println(plainsEnemy3.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 4: 
                // TUNDRA ENEMIES 
                System.out.println(tundraEnemy1.getEnemyName() + " heals!\n+1");
                if (tundraEnemy1.enemHp == tundraEnemy1.emaxHp) {
                    System.out.println("The Ice maxes out!");
                    tundraEnemy1.enemHp = tundraEnemy1.emaxHp; 
                    System.out.println(tundraEnemy1.getEnemyName() + "'s HP: " + tundraEnemy1.getEnemyHealth());
                } else {
                    currentHp = (tundraEnemy1.enemHp + 1); 
                    System.out.println(tundraEnemy1.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 5: 
                System.out.println(tundraEnemy2.getEnemyName() + " heals\n+1");
                if (tundraEnemy2.enemHp == tundraEnemy2.emaxHp) {
                    System.out.println("The Whale maxes out!");
                    tundraEnemy2.enemHp = tundraEnemy2.emaxHp; 
                    System.out.println(tundraEnemy2.getEnemyName() + "'s HP: " + tundraEnemy2.getEnemyHealth());
                } else {
                    currentHp = (tundraEnemy2.enemHp + 1);
                    System.out.println(tundraEnemy2.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 6: 
                System.out.println(tundraEnemy3.getEnemyName() + " heals!\n+1");
                if (tundraEnemy3.enemHp == tundraEnemy2.emaxHp) {
                    System.out.println("The Raindeer maxes out!");
                    tundraEnemy3.enemHp = tundraEnemy3.emaxHp; 
                    System.out.println(tundraEnemy3.getEnemyName() + "'s HP: " + tundraEnemy3.getEnemyHealth());
                } else {
                    currentHp = (tundraEnemy3.enemHp + 1); 
                    System.out.println(tundraEnemy3.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 7: 
                // FOREST ENEMIES 
                System.out.println(forestEnemy1.getEnemyName() + " heals!\n+1");
                if (forestEnemy1.enemHp == forestEnemy1.emaxHp) {
                    System.out.println("The Vine maxes out!");
                    forestEnemy1.enemHp = forestEnemy1.emaxHp; 
                    System.out.println(forestEnemy1.getEnemyName() + "'s HP: " + forestEnemy1.getEnemyHealth());
                } else {
                    currentHp = (forestEnemy1.enemHp + 1); 
                    System.out.println(forestEnemy1.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 8: 
                System.out.println(forestEnemy2.getEnemyName() + " heals!\n+1");
                if (forestEnemy2.enemHp == forestEnemy2.emaxHp) {
                    System.out.println("The Monkey Maxes out!");
                    forestEnemy2.enemHp = forestEnemy1.emaxHp;
                    System.out.println(forestEnemy2.getEnemyName() + "'s HP: " + forestEnemy2.getEnemyHealth());
                } else {
                    currentHp = (forestEnemy2.enemHp + 1);
                    System.out.println(forestEnemy2.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 9: 
                System.out.println(forestEnemy3.getEnemyName() + " heals!\n+1");
                if (forestEnemy3.enemHp == forestEnemy3.emaxHp) {
                    System.out.println("The Slime maxes out!");
                    forestEnemy3.enemHp = forestEnemy3.emaxHp; 
                    System.out.println(forestEnemy3.getEnemyName() + "'s HP: " + forestEnemy3.getEnemyHealth());
                } else { 
                    currentHp = (forestEnemy3.enemHp + 1); 
                    System.out.println(forestEnemy3.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 10: 
                // DUNES ENEMIES 
                System.out.println(dunesEnemy1.getEnemyName() + " heals!\n+1");
                if (dunesEnemy1.enemHp == dunesEnemy1.emaxHp) {
                    System.out.println("The Vulture Maxes out!");
                    dunesEnemy1.enemHp = dunesEnemy1.emaxHp; 
                    System.out.println(dunesEnemy1.getEnemyName() + "'s HP: " + dunesEnemy1.getEnemyHealth());
                } else {
                    currentHp = (dunesEnemy1.enemHp + 1);
                    System.out.println(dunesEnemy1.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 11: 
                System.out.println(dunesEnemy2.getEnemyName() + " heals!\n+1");
                if (dunesEnemy2.enemHp == dunesEnemy2.emaxHp) {
                    System.out.println("The Possum Maxes out!");
                    dunesEnemy2.enemHp = dunesEnemy2.emaxHp;
                    System.out.println(dunesEnemy2.getEnemyName() + "'s HP: " + dunesEnemy2.getEnemyHealth());
                } else {
                    currentHp = (dunesEnemy2.enemHp + 1); 
                    System.out.println(dunesEnemy2.getEnemyName() + "'s HP: " + currentHp);
                }
                break; 
            case 12: 
                System.out.println(dunesEnemy3.getEnemyName() + "heals!\n+1");
                if (dunesEnemy3.enemHp == dunesEnemy3.emaxHp) {
                    System.out.println("The Worm Maxes out!");
                    dunesEnemy3.enemHp = dunesEnemy3.emaxHp; 
                    System.out.println(dunesEnemy3.getEnemyName() + "'s HP: " + dunesEnemy3.getEnemyHealth() );
                } else {
                    currentHp = (dunesEnemy3.enemHp + 1);
                    System.out.println(dunesEnemy3.getEnemyName() + "'s HP: " + currentHp);
                }
                break;
                
        }
    }

    public void battleScreen() {
        int playerSelect;
        int randomNum;  
        
        int minVal = 0; 
        int maxVal = 1;

        Timer tmr = new Timer();
        ThreadLocalRandom tlr = ThreadLocalRandom.current();

        phase phse = new phase(); 
        player pl = new player(name);

        Scanner scan = new Scanner(System.in);

        System.out.println(player.name + "\nHP: " + player.hp + "\n========");
        System.out.println("1.) ATTACK ============ 2.) HEAL\n\nSelect either 1 or 2....");
        
        try {
            playerSelect = scan.nextInt(); 
            if (playerSelect == 1) {
                System.out.println("==========");
                playerAttack();
                System.out.println("==========");
            } else if (playerSelect == 2) {
                System.out.println("==========");
                pl.getHpBoost();
                System.out.println("==========");
            } else {
                System.out.println("==========");
                System.out.println("Out of bounds! ");
                battleScreen();
            }
        } catch (InputMismatchException ie) {
            System.out.println("That is an invalid input please try again...");
            battleScreen();
        }
        
        switch(enemyName) {
            case "Bull": 
                // ==========plains enemies========== 
                System.out.println("It is the " + plainsEnmy1.getEnemyName()+"'s turn!");
                //enemyAttack();
                randomNum = tlr.nextInt(minVal, maxVal + 1);
                System.out.println("==========");
                if (randomNum == 0) {
                    tmr.schedule(enemyAttacking, 1500);
                } else if (randomNum == 1) {
                    tmr.schedule(enemyHealing, 1500);
                } else {
                    System.out.println("Unknown error has occurred...");
                }
                break; 
            case "Moose": 
                System.out.println("It is the " + plainsEnemy2.getEnemyName()+"'s turn!");
                //enemyAttack();
                randomNum = tlr.nextInt(minVal, maxVal + 1);
                System.out.println("==========");
                if (randomNum == 0) {
                    tmr.schedule(enemyAttacking, 1500);
                } else if (randomNum == 1) {
                    tmr.schedule(enemyHealing, 1500);
                } else {
                    System.out.println("Unknown error has occurred...");
                }
                break; 
            case "Bird": 
                System.out.println("it is the " + plainsEnemy3.getEnemyName()+"'s turn!");
                //enemyAttack();
                randomNum = tlr.nextInt(minVal, maxVal + 1);
                System.out.println("==========");
                if (randomNum == 0) {
                    tmr.schedule(enemyAttacking, 1500);
                } else if (randomNum == 1) {
                    tmr.schedule(enemyHealing, 1500);
                } else {
                    System.out.println("Unknown error has occurred...");
                }
                break;
            case "Mound": 
                // ========== tundra enemies ========== 
                System.out.println("It is the " + tundraEnemy1.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Whale": 
                System.out.println("It is the " + tundraEnemy2.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Raindeer": 
                System.out.println("It is the " + tundraEnemy3.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Vine": 
                // ========== forest enemies========== 
                System.out.println("It is the " + forestEnemy1.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Monkey": 
                System.out.println("It is the " + forestEnemy2.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Slime": 
                System.out.println("It is the " + forestEnemy3.getEnemyName() + "'s turn!");
                enemyAttack();
                break;
            case "Vulture": 
                //  ========== dunes enemies ========== 
                System.out.println("It is the " + dunesEnemy1.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Possum": 
                System.out.println("It is the " + dunesEnemy2.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
            case "Worm": 
                System.out.println("It is the " + dunesEnemy3.getEnemyName() + "'s turn!");
                enemyAttack();
                break; 
        } 

    }
}
