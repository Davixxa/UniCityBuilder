package com.example.unicitybuildergui;

public class ScienceBuilding extends Building {

    int range;
    //Constructor and base stats for the science buildings
    public ScienceBuilding(int coordinate) {
        this.buildingCost = 200;
        this.currentLevel = 1;
        this.upgradeCost = 200;
        this.coordinate = coordinate;
        this.yield = 5;
        this.range = 10;
        this.destroyed = false;
        this.displayName = "Public School";
        this.pollution = 0;
        this.buildingType = BuildingTypes.SCIENCE;
        this.energyUpKeepCost = 10;
        this.moneyUpKeepCost = 30;

    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getPollutionYield() {
        return pollution;
    }
    public int getRange() {
        return range;
    }

    //Our upgrade Function for the money building
    @Override
    public String upgrade(MoneyManager moneyManager) {
        //Set your new money value and checks if you have enough money to upgrade
        int newMoney = moneyManager.getCurrentMoney() - this.upgradeCost;
        if (newMoney < 0) {
            return "Error: Insufficient funds";
        }
        else {
            moneyManager.setCurrentMoney(newMoney);
            this.currentLevel++;
            this.yield += 8;
            // High School, University
            this.upgradeCost += 200; // Another placeholder.
            this.energyUpKeepCost += 10;
            if (this.currentLevel == 2) {
                this.displayName = "High School";
            }
            else if (this.currentLevel == 3) {
                this.displayName = "University";
            }
            return null;
        }
    }
}
