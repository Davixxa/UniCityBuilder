package com.example.javafxbuilder;
public class InfastructureManager {

    //Variables
    public int level;
    public int upgradeCost;
    public int repairCost;
    public boolean isDamaged;

    //Constructor
    public InfastructureManager() {
        level = 1;
        upgradeCost = 100;
        repairCost = 50;
        isDamaged = false;
    }

    //Methods
    public void upgrade() {
        level++;
        upgradeCost *= 2;
        repairCost *= 2;
    }

    public void damage() {
        isDamaged = true;
    }

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
