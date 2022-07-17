package gameCode.gameLogic;

public class entity {
    public String name; 
    public int hp, dmg, maxHp;
    
    public entity(String name, int hp, int dmg, int maxHp) {
        this.name = name; 
        this.hp = hp; 
        this.dmg = dmg;
        this.maxHp = maxHp; 
    }
}
