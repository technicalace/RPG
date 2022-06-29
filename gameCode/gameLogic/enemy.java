package gameCode.gameLogic;

public class enemy {
    public String enemName, enemDesc;
    public int enemDmg;
    public int enemHp;

    public void plainsEnemy() {
        enemy bull = new enemy("Ferioucious Bull", "Ears are blowing steam!", 6, 21);
        enemy moose = new enemy("Clever Moose", "Constantly plotting...", 4, 19);
        enemy bird = new enemy("Obnoxious Bird", "KAWWWK KAWWWK", 5, 16);
    }

    public enemy(String name, String desc, int dmg, int hp) {
        this.enemName = name;
        this.enemDmg = dmg; 
        this.enemHp = hp; 
    }
}
