package gameCode;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TimerTask;

import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthSpinnerUI;

import java.util.Timer;

import gameCode.gameLogic.enemy;
import gameCode.gameLogic.entity;
import gameCode.gameLogic.phase;
import gameCode.gameLogic.player;

public class game {
    public int userR;
    public String uResp, name;
    public static player player;

    static Scanner scanner = new Scanner(System.in);
    
    public void intro() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to an RPG.\nInsert your name: ");

        name = scanner.next(); 
        player = new player(name);

        if(!isString(name)) {
            System.out.println("==========");
            System.out.println("That is not a valid input, please try again.");
            intro();
        } else {
            System.out.println("==========");
        System.out.println("Welcome " + player.name + "\nSelect the biome you would like to start in:");
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

        Biome myBiome;

        System.out.println("1.) Plains\n2.) Tundra\n3.) Forest\n4.) Dunes\n");

        try {
            userR = scan.nextInt(); 
            switch(userR) {
                case 1: 
                    System.out.println("=========");
                    checkBiome(Biome.PLAINS);
                    break;
                case 2: 
                    System.out.println("==========");
                    checkBiome(Biome.TUNDRA);
                    break;
                case 3: 
                    System.out.println("==========");
                    checkBiome(Biome.FOREST);
                    break; 
                case 4: 
                    System.out.println("==========");
                    checkBiome(Biome.DUNES);
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

        TimerTask battlePhase = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                phse.battlePlains();
            }
            
        };

        // OUTPUT TO USER
        System.out.println("You have chosen the plains biome.");
        tmr.schedule(dialogue1, 1500);
        tmr.schedule(dialogue2, 3500);
        tmr.schedule(battlePhase, 5500);
    }


    // TUNDRA
    void tundra() {
        Scanner scan = new Scanner(System.in); 
        Timer tmr = new Timer(); 

        phase phse = new phase();

        TimerTask dialogue1 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You walk around and feel the chilling wind through the crisp air.");
            }
            
        };

        TimerTask dialogue2 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("The snow is crunchy...");    
            }
            
        };

        TimerTask tunBoss = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                    phse.battleTundra(); 
            }
            
        };

        System.out.println("You have chosen the tundra biome.");
        tmr.schedule(dialogue1, 1500);
        tmr.schedule(dialogue2, 3500);
        tmr.schedule(tunBoss, 5500);
    }
    // FOREST BIOME 
    void forest() {
        Scanner scan = new Scanner(System.in); 
        Timer tmr = new Timer(); 

        phase phse = new phase();

        TimerTask dialogue1 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You land into a tree...");    
            }
            
        };

        TimerTask dialogue2 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("As you climb down from the tree the air around you feels damp and humid...");
            }
        };

        TimerTask dialogue3 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You start walking on forward from the tree...");   
            }
        };

        TimerTask forestBoss = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                phse.battleForest();
            }
            
        };

        System.out.println("You have chosen the forest biome.");
        tmr.schedule(dialogue1, 1500);
        tmr.schedule(dialogue2, 3500);
        tmr.schedule(dialogue3, 5500);
        tmr.schedule(forestBoss, 7500);
        
    }
    // DUNES BIOME
    void dunes() {
        Scanner scan = new Scanner(System.in); 
        Timer tmr = new Timer(); 

        phase phse = new phase();

        TimerTask dialogue1 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You wake up on hot sand...");
            }
            
        };

        TimerTask dialogue2 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You see the blazing sun in the middle of the sky as you stand up...");                
            }
        };

        TimerTask dialogue3 = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                System.out.println("You start walking forward from where you woke up...");    
            }
            
        };

        TimerTask dunesBoss = new TimerTask() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                phse.battleDunes();
            }
            
        };
        System.out.println("You have chosen the tundra biome...");
        tmr.schedule(dialogue1, 1500);
        tmr.schedule(dialogue2, 3500);
        tmr.schedule(dialogue3, 5500);
        tmr.schedule(dunesBoss, 7500);

    }

    public void checkBiome(Biome myBiome) {
        switch(myBiome) {
            case PLAINS: 
                plains();
                break;
            case TUNDRA: 
                tundra();
                break;
            case FOREST: 
                forest();
                break;
            case DUNES: 
                dunes();
                break; 
            default: 
                System.out.println("Something went wrong...");
                break;
        }
    }

    public boolean isString(String name) {
        return name.matches("[a-zA-Z]+");
    }  

    public void battleScreen() {
        int playerSelect; 

        phase phse = new phase(); 
        player pl = new player(name);

        Scanner scan = new Scanner(System.in);

        System.out.println(player.name + "\nHP: " + player.hp + "\n========");
        System.out.println("1.) ATTACK ============ 2.) HEAL\n\nSelect either 1 or 2....");
        
        try {
            playerSelect = scan.nextInt(); 
            if (playerSelect == 1) {
                phse.playerAttack();
            } else if (playerSelect == 2) {
                pl.getHpBoost();
            } else {
                System.out.println("Out of bounds! ");
                battleScreen();
            }
        } catch (InputMismatchException ie) {
            System.out.println("That is an invalid input please try again...");
            battleScreen();
        }

    }
}



