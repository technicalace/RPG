package gameCode.gameLogic;

public class enemy {
    public String enemName, enemDesc;
    public int enemDmg;
    public int enemHp;
    public int emaxHp;
    public String enemIntro;

    public void plainsEnemy() {
        enemy bull = new enemy("Ferioucious Bull","You see something big in the distance...", "Ears are blowing steam!", 6, 21, 21);
        enemy moose = new enemy("Clever Moose","Constantly plotting... ", "You hear something rustle in the tall grass...", 4, 19, 19);
        enemy bird = new enemy("Obnoxious Bird","KAWWWK KAWWWK", "You see something soar in the sky...", 5, 16, 16);
    }

    public enemy(String ename, String edesc, String eintro, int edmg, int ehp, int emaxHp) {
        this.enemName = ename;
        this.enemIntro = eintro;
        this.enemDesc = edesc;
        this.enemDmg = edmg; 
        this.enemHp = ehp; 
        this.emaxHp = emaxHp;
    }

    

    // GETTERS
    public String getEnemyName() {
        return this.enemName;
    }

    public String getEnemyDesc() {
        return this.enemDesc; 
    }

    public String getEnemyIntro() {
        return this.enemIntro; 
    }

    public int getEnemyDmg() {
        return this.enemDmg;
    }

    public int getEnemyHealth() {
        return this.enemHp;
    }

    // SETTERS
    public void setEnemyName(String ename) {
        this.enemName = ename;
    }

    public void setEnemyDesc(String edesc) {
        this.enemDesc = edesc;
    }

    public void setEnemyIntro(String eintro) {
        this.enemIntro = eintro;
    }

    public void setEnemyDmg(int edmg) {
        this.enemDmg = edmg; 
    }

    public void setEnemyHp(int ehp) {
        this.enemHp = ehp; 
    }


    
 }
