import java.util.HashMap;

public class MoneyManager {
    private int moneyGain;
    private int currentMoney;
    private int moneyUpkeep;

    BuildingManager buildingManager;


    public MoneyManager(int moneyGain, int currentMoney, int moneyUpkeep, BuildingManager buildingmanager) {
        this.moneyGain = moneyGain;
        this.currentMoney = currentMoney;
        this.moneyUpkeep = moneyUpkeep;
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
            switch (i.getBuildingType) {

                case BuildingTypes.MONEY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case BuildingTypes.ENERGY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case BuildingTypes.HOUSE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                case BuildingTypes.SCIENCE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.moneyUpkeep += 10;

                    break;

                default:
                    // code block
            }

            if (i.getBuildingType() == BuildingTypes.MONEY) {
                if (i.getdestroyed() == false) {
                    this.moneyGain += i.getYield();
                }
            }
        }
        this.moneyGain -= this.moneyUpkeep;
        this.currentMoney += this.moneyGain;
    }


}
