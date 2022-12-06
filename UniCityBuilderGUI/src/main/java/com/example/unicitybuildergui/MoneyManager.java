package com.example.unicitybuildergui;

import java.util.HashMap;

public class MoneyManager {
    private int moneyGain;
    private int currentMoney;
    private int moneyUpkeep;
    BuildingManager buildingManager;

    //Constructor and set our base stats for the start of the game
    public MoneyManager(BuildingManager buildingmanager) {
        this.moneyGain = 0;
        this.currentMoney = 1000;
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


    public int getMoneyUpkeep() {
        return moneyUpkeep;
    }


    public void calcMoneyGain(EnergyManager energyManager, InfastructureManager infastructureManager) {
    //Calculates our money gain each turn
        this.moneyGain = 0;
        this.moneyUpkeep = 0;
        for (Building i : buildingManager.map.values()) {
            if (i.getBuildingType() == BuildingTypes.MONEY) {
                if (i.isDestroyed() == false) {
                    if(energyManager.getCurrentEnergy()>0){
                        energyManager.setCurrentEnergy(energyManager.getCurrentEnergy()-i.getEnergyUpKeepCost());
                        currentMoney=currentMoney-i.moneyUpKeepCost;
                        this.moneyGain += i.getYield();
                    }
                }
            }
        }
        this.moneyGain *= (1+infastructureManager.getLevel()*0.1);
        this.moneyGain -= this.moneyUpkeep;
        this.currentMoney += this.moneyGain;
    }

}
