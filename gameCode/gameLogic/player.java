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


}
