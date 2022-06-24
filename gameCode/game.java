package gameCode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;
import java.util.Timer;

import gameCode.gameLogic.player;

public class game {
    public String name;
    
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

    void biomeSelect() {
        Scanner scan = new Scanner(System.in);
        int uResp;

        player pl = new player();

        System.out.println("==========");
        System.out.println("Welcome " +name+ "\nSelect the biome you would like to start in:");

        ArrayList<String> biomeSelect = new ArrayList<String>(); 
        
        biomeSelect.add(0, "Plains"); 
        biomeSelect.add(1, "Tundra");
        biomeSelect.add(2, "Forest"); 
        biomeSelect.add(3, "Dunes");

        try {
            uResp = scan.nextInt(); 
            
            switch(uResp) {
                case 1: 
                    System.out.println("=========");
                    plains();
                    break;
                case 2: 
                    System.out.println("==========");
                    tundra();
                    break;
                case 3: 
                    System.out.println("==========");
                    forest();
                    break; 
                case 4: 
                    System.out.println("==========");
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

    void plains() {
        Scanner scan = new Scanner(System.in);
        Timer tmr = new Timer();


        
        System.out.println("You have chosen the plains biome.");

        TimerTask dialogue1 = new TimerTask() {

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
    }

    void tundra() {

    }

    void forest() {

    }

    void dunes() {

    }

    public boolean isString(String name) {
        return name.matches("[a-zA-Z]+");
    }
}
