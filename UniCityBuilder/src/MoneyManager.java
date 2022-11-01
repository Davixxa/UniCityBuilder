import java.util.HashMap;

public class MoneyManager {
    private int moneyGain;
    private int currentMoney;
    private int moneyUpkeep;

    BuildingManager buildingManager;


    public MoneyManager(BuildingManager buildingmanager) {
        this.moneyGain = 0;
        this.currentMoney = 100;
        this.moneyUpkeep = 0;
        this.buildingManager = buildingmanager;
    }

    public int getCurrentMoney() {
        return currentMoney;
    }

    public void setCurrentMoney(int currentMoney) {
        this.currentMoney = currentMoney;
    }

    public int getMoneyGain() {
        return moneyGain;
    }

    public void setMoneyGain(int moneyGain) {
        this.moneyGain = moneyGain;
    }

    public int getMoneyUpkeep() {
        return moneyUpkeep;
    }

    public void setMoneyUpkeep(int moneyUpkeep) {
        this.moneyUpkeep = moneyUpkeep;
    }

/*
    public void setMoneyGain() {
        this.moneyGain = 0;
        for (int i = 0; i < HashMap.size(); i++) {
            if (HashMap.get(i) == MONEY) {
                if (HashMap.get(i).getdestroyed()==false) {
                    this.moneyGain += HashMap.get(i).getYield();
                }
            }
        }
        this.moneyGain -= this.moneyUpkeep;
    }
 */

    public void calcMoneyGain() {
        this.moneyGain = 0;
        for (Building i : buildingManager.map.values()) {
            this.moneyUpkeep += i.moneyUpKeepCost;

            /*
            switch (i.getBuildingType()) {

                case MONEY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case ENERGY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case HOUSE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case SCIENCE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                default:
                    // code block
            }
             */

            if (i.getBuildingType() == BuildingTypes.MONEY) {
                if (i.isDestroyed() == false) {
                    this.moneyGain += i.getYield();
                }
            }
        }
        this.moneyGain -= this.moneyUpkeep;
        this.currentMoney += this.moneyGain;
    }


}
