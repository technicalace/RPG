package gameCode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;



import java.util.Timer;

import gameCode.gameLogic.phase;
import gameCode.gameLogic.player;

public class game {
    public String name, biome;
    public int uResp;
    
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

    public void biomeSelect() {
        Scanner scan = new Scanner(System.in);

        player pl = new player();

        System.out.println("==========");
        System.out.println("Welcome " +name+ "\nSelect the biome you would like to start in:");
        System.out.println("1.) Plains\n2.) Tundra\n3.) Forest\n4.) Dunes\n");

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
                    biome = "Plains";
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

    public void plains() {
        Scanner scan = new Scanner(System.in);
        Timer tmr = new Timer();

        phase phse = new phase();
        
        System.out.println("You have chosen the plains biome.");
        phse.battle();


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

   /*public boolean isPlains(int uResp) {
        if (uResp == 1) {
            return true; 
        } else {
            return false;
        }
   }

   public boolean isTundra(int uResp) {
        if (uResp == 2) {
            return true; 
        } else {
            return false;
        }
    }

   public boolean isForest(int uResp) {
        if (uResp == 3) {
            return true; 
        } else {
            return false;
        }
}

   public boolean isDunes(int uResp) {
        if (uResp == 4) {
            return true; 
        } else {
            return false;
        }*/
    }

 


