package gameCode.gameLogic;

public class enemy {
    public String enemName, enemDesc;
    public int enemDmg;
    public int enemHp;
    public int emaxHp;
    public String enemIntro;
    public boolean isAlive;

    public int enemyNum;
    
    public enemy(String ename, String edesc, String eintro, int edmg, int ehp, int emaxHp, boolean ealive) {
        this.enemName = ename;
        this.enemIntro = eintro;
        this.enemDesc = edesc;
        this.enemDmg = edmg; 
        this.enemHp = ehp; 
        this.emaxHp = emaxHp;
        this.isAlive = ealive; 
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

    public boolean isAlive() {
        if (enemHp != 0) {
            return isAlive;
        } else {
            return false;
        }
    }


    
 }
