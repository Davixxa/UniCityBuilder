package com.example.unicitybuildergui;

import java.lang.Math;


public class EnergyManager {
    private int energyGain;
    private int currentEnergy;
    private float energyDecay;
    private int energyUpkeep;

    BuildingManager buildingManager;



    public EnergyManager(BuildingManager buildingManager){
        this.energyGain = 0;
        this.currentEnergy = 100;
        this.energyDecay=1; // = 0.9f;
        this.energyUpkeep = 0;
        this.buildingManager = buildingManager;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public double getEnergyDecay() {
        return energyDecay;
    }

    public void setEnergyDecay(float energyDecay) {
        this.energyDecay = energyDecay;
    }

    public int getEnergyGain() {
        return energyGain;
    }

    public void setEnergyGain(int energyGain) {
        this.energyGain = energyGain;
    }



    public void calcEnergyGain(MoneyManager moneyManager) {
        this.energyGain = 0;
        this.energyUpkeep = 0;
        for (Building i : buildingManager.map.values()) {
            if (i.getBuildingType() == BuildingTypes.ENERGY) {
                if (i.isDestroyed() == false) {
                    currentEnergy=currentEnergy-i.energyUpKeepCost;
                    this.energyGain += i.getYield();
                    moneyManager.setCurrentMoney(moneyManager.getCurrentMoney()-i.moneyUpKeepCost);
                }
            }
        }
        this.energyGain -= this.energyUpkeep;
        this.currentEnergy += this.energyGain;
        this.currentEnergy = Math.round(this.currentEnergy * energyDecay);

    }


}
