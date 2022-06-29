package gameCode.gameLogic;

import gameCode.game;

public class phase extends game{
    public void battle() {
        game gm = new game(); 

        if (biome == "Plains") {
            System.out.println("Hello");
        } else if (biome == "Tundra") {
            System.out.println("World");
        }
    }
}
