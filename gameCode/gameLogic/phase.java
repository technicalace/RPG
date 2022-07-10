package gameCode.gameLogic;

import java.util.ArrayList;
import java.util.Random;

import gameCode.game;

public class phase extends game{
    game gm = new game(); 
    // PLAINS ENEMIES 
    enemy plainsEnmy1 = new enemy("Ferioucious Bull","You see something big in the distance...", "Ears are blowing steam!", 6, 21);
    enemy plainsEnemy2 = new enemy("Clever Moose","Constantly plotting... ", "You hear something rustle in the tall grass...", 4, 19);
    enemy plainsEnemy3 = new enemy("Obnoxious Bird","KAWWWK KAWWWK", "You see something soar in the sky...", 5, 16);
    // TUNDRA ENEMIES
    enemy tundraEnemy1 = new enemy("Living Ice Mound", "Jumpy and crunchy!", "You feel the ground on your feet lower...", 3, 13);
    enemy tundraEnemy2 = new enemy("Frantic Whale", "It's huge!", "A frozen lake seprates you and the other side of the land, something starts to lift up...", 7, 16);
    enemy tundraEnemy3 = new enemy("Magic Raindeer", "Magical properties, never attacks directly.", "You hear prancing and a bright light in the distance getting closer...", 6, 15);
    // FOREST ENEMIES 
    enemy forestEnemy1 = new enemy("Living Vine", "Always growing.", "You step on a vine, it moved!", 6, 18);
    enemy forestEnemy2 = new enemy("Raging Monkey", "Head is steaming!", "You hear branches crack from above...", 7, 17);
    enemy forestEnemy3 = new enemy("Green Slime", "Goopy", "You see slime drip from the tree... it starts to fall into a blob.",4, 24);
    // DUNWA ENEMIES
    enemy dunesEnemy1 = new enemy("Fericoucious Vulture", "Looking to pick a fight.", "You see a soaring shadow block the blazing sun...", 7, 16);
    enemy dunesEnemy2 = new enemy("Cheeky Possum", "Scraubling around.", "You hear pitter patter on the floor...", 7, 15);
    enemy dunesEnemy3 = new enemy("Giant Sand Worm", "Slithering around.", "You feel the ground shift under your feet...", 9, 19);

    // BATTLE PHASES 
    public void battlePlains() {
        Random rand = new Random();
        player pl = new player(); 

        String[] plainsEnemies = {"Bull", "Moose", "Bird"};

        int randEnemy = rand.nextInt(plainsEnemies.length); 
        switch(randEnemy) {
            case 0: 
                System.out.println(plainsEnmy1.getEnemyDesc());
                System.out.println("The " + plainsEnmy1.getEnemyName() + " attacks!\n==========");

                pl.battleScreen();
                break;
            case 1: 
                System.out.println(plainsEnemy2.getEnemyDesc());
                System.out.println("The " + plainsEnemy2.getEnemyName() + " attacks!\n==========");

                pl.battleScreen();
                break;
            case 2: 
                System.out.println(plainsEnemy3.getEnemyDesc());
                System.out.println("The " + plainsEnemy3.getEnemyName() + " attacks!\n==========");

                pl.battleScreen();
                break;
        }             
        //System.out.println(this.name);
    }

    public void battleTundra() {

    }

    public void battleForest() {

    }

    public void battleDunes() {

    }
}
