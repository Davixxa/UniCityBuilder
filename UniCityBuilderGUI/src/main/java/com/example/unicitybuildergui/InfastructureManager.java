package com.example.unicitybuildergui;
public class InfastructureManager {

    //Variables
    //Is our base level
    public int level;
    //Is a base upgrade cost
    public int upgradeCost;
    //Is a base repair cost
    public int repairCost;
    //Is for when something is damaged
    public boolean isDamaged;


    //Constructor
    public InfastructureManager() {
        level = 1;
        upgradeCost = 150;
        repairCost = 50;
        isDamaged = false;
    }

    //Upgrade method
    public void upgrade(MoneyManager moneyManager) {
        int newMoney = moneyManager.getCurrentMoney() - upgradeCost;
        if (newMoney < 0){
            System.out.println("Error: Insufficient funds");
        }else {
            moneyManager.setCurrentMoney(newMoney);
            this.level++;
            upgradeCost +=150;
            repairCost *= 2;
        }
    }
    //our method for setting something to damaged = true
    public void damage() {
        isDamaged = true;
    }
    //repair method for when something is damaged
    public void repair(MoneyManager moneyManager) {
        if (isDamaged == true) {
            moneyManager.setCurrentMoney(moneyManager.getCurrentMoney() - repairCost);
        }
    }

    //Get methods
    public int getLevel() {
        return level;
    }

    public boolean getIsDamaged() {
        return false;
    }

}
