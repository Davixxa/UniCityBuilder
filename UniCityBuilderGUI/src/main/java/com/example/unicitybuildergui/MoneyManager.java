package com.example.unicitybuildergui;

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


    public int getMoneyUpkeep() {
        return moneyUpkeep;
    }



    public void calcMoneyGain(EnergyManager energyManager) {
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
        this.moneyGain -= this.moneyUpkeep;
        this.currentMoney += this.moneyGain;
    }

}
