import java.util.HashMap;

public class MoneyManager {
    private int moneyGain;
    private int currentMoney;
    private int moneyUpkeep;


    public MoneyManager(int moneyGain, int currentMoney, int moneyUpkeep){
        this.moneyGain = moneyGain;
        this.currentMoney = currentMoney;
        this.moneyUpkeep = moneyUpkeep;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }


/*
    public void setMoneyGain(){
        this.moneyGain = 0;
        for(int i = 0; i<HashMap.size(); i++ ){
            if(HashMap.get(i)==MONEY){
                this.moneyGain += HashMap.get(i).getYield();
            }
        }
        this.moneyGain -=this.moneyUpkeep;
    }
 */


}
