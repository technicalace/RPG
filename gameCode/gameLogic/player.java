package gameCode.gameLogic;

public class player extends gameCode.game{
    public String playerName; 
    public int playerHp, playerDmg;
    
    public void setPName(String pName) {
        this.playerName = pName; 
    }

    public void setPHp(int pHp) {
        this.playerHp = pHp;
    }

    public void setPDmg(int pDmg) {
        this.playerDmg = pDmg;
    }

    public String getPName() {
        return playerName; 
    }

    public int getPHp() {
        return playerHp;
    }

    public int getPDmg() {
        return playerDmg;
    }

    public void fullHeal() {
        if (playerHp < 20) {
            playerHp = 20;
        }
    }

    public void gameOver(){ 
        if (playerHp == 0) {
            System.out.println("You have died! Ending the game...");

            System.exit(0);
        }
    }

    public void battleScreen() { // battle screen that will pop up during battle phase
        System.out.println("1.) Fight ---------- 2.) Heal");
    }
 }
