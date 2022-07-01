package gameCode.gameLogic;

public class enemy {
    public String enemName, enemDesc;
    public int enemDmg;
    public int enemHp;
    public String ememIntro;

    public void plainsEnemy() {
        enemy bull = new enemy("Ferioucious Bull","You see something big in the distance...", "Ears are blowing steam!", 6, 21);
        enemy moose = new enemy("Clever Moose","Constantly plotting... ", "You hear something rustle in the tall grass...", 4, 19);
        enemy bird = new enemy("Obnoxious Bird","KAWWWK KAWWWK", "You see something soar in the sky...", 5, 16);
    }

    public enemy(String name, String desc, String intro, int dmg, int hp) {
        this.enemName = name;
        this.ememIntro = intro;
        this.enemDesc = desc;
        this.enemDmg = dmg; 
        this.enemHp = hp; 
    }

    public String getEnemyName() {
        return this.enemName;
    }

    public String getEnemyDesc() {
        return this.enemDesc; 
    }

    public String getEnemyIntro() {
        return this.ememIntro; 
    }

    public int getEnemyDmg() {
        return this.enemDmg;
    }

    public int getEnemyHealth() {
        return this.enemHp;
    }
}
