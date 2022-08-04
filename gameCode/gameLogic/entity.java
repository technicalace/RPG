package gameCode.gameLogic;

public class entity {
    public String name; 
    public int hp, dmg, maxHp;
    public boolean isalive;
    
    public entity(String name, int dmg, int hp, int maxHp, boolean isalive) {
        this.name = name; 
        this.dmg = dmg;
        this.hp = hp;
        this.maxHp = maxHp; 
        this.isalive = isalive;
    }
}
