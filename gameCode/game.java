package gameCode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;



import java.util.Timer;

import gameCode.gameLogic.phase;
import gameCode.gameLogic.player;

public class game {
    public String name;
    public int userR;
    public Biome biome;
    
    public void intro() {
        Scanner scan = new Scanner(System.in);
        String uResp;

        player pl = new player();
        System.out.println("Welcome to an RPG.\nInsert your name: ");

        name = scan.nextLine();
        if(!isString(name)) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            intro();
        } else {
            biomeSelect();
        }
      
    }

     // ENUM METHODS
     public enum Biome {
        PLAINS,
        TUNDRA,
        FOREST,
        DUNES
    }

    // BIOME SELECT
    public void biomeSelect() {
        Scanner scan = new Scanner(System.in);

        player pl = new player();

        System.out.println("==========");
        System.out.println("Welcome " +name+ "\nSelect the biome you would like to start in:");
        System.out.println("1.) Plains\n2.) Tundra\n3.) Forest\n4.) Dunes\n");

        Biome plns = Biome.PLAINS;
        Biome tudra = Biome.TUNDRA; 
        Biome frst = Biome.FOREST; 
        Biome dns = Biome.DUNES;
        
        try {
            userR = scan.nextInt(); 
            switch(userR) {
                case 1: 
                    System.out.println("=========");
                    plains();
                    break;
                case 2: 
                    System.out.println("==========");
                    biome = biome.TUNDRA;
                    tundra();
                    break;
                case 3: 
                    System.out.println("==========");
                    biome = biome.FOREST;
                    forest();
                    break; 
                case 4: 
                    System.out.println("==========");
                    biome = biome.DUNES;
                    dunes();
                    break; 
                default:
                    System.out.println("==========");
                    System.out.println("That input is out of bounds, please try again.");
                    biomeSelect();
                    break;
            }
        } catch (InputMismatchException ie) {
            System.out.println("==========");
            System.out.println("That is an invalid input, please try again.");
            biomeSelect();
        }
    }

    // PLAINS
    public void plains() {
        Scanner scan = new Scanner(System.in);
        Timer tmr = new Timer();

        phase phse = new phase();
        
        System.out.println("You have chosen the plains biome.");
        biome = biome.PLAINS;


        TimerTask dialogue1 = new TimerTask() { // declaring timer task 

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You woke up, laying on grass while the wind blows through the air...");
            }

        };

        TimerTask dialogue2 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You look around yourself, this place is unfamiliar...");
            }
            
        };

        TimerTask dialogue3 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You start to walk forward until you hear rustling in the tall grass.");
            }
        };

        

    }

    // TUNDRA
    void tundra() {
        Scanner scan = new Scanner(System.in); 
        Timer tmr = new Timer(); 

        phase phse = new phase();

        System.out.println("You have chosen the tundra biome.");
        phse.battle();

        TimerTask dialogue1 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You walk around and feel the chilling wind through the crisp air.");
            }
            
        };
    }

    void forest() {
        phase phse = new phase();

        phse.battle();
    }

    void dunes() {
        phase phse = new phase();

        phse.battle();

    }

    public boolean isString(String name) {
        return name.matches("[a-zA-Z]+");
    }

  

}


