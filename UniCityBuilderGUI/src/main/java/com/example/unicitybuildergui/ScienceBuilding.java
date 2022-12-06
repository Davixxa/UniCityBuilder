package com.example.unicitybuildergui;

public class ScienceBuilding extends Building {

    int range;
    //Constructor and base stats for the science buildings
    public ScienceBuilding(int coordinate) {
        this.buildingCost = 300;
        this.currentLevel = 1;
        this.upgradeCost = 300;
        this.coordinate = coordinate;
        this.yield = 10;
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
    public void upgrade(MoneyManager moneyManager) {
        //Set your new money value and checks if you have enough money to upgrade
        int newMoney = moneyManager.getCurrentMoney() - this.upgradeCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            moneyManager.setCurrentMoney(newMoney);
            this.currentLevel++;
            this.yield += 0;
            // High School, University
            this.upgradeCost += 300; // Another placeholder.
            this.energyUpKeepCost += 10;
            if (this.currentLevel == 2) {
                this.displayName = "High School";
            }
            else if (this.currentLevel == 3) {
                this.displayName = "University";
            }
        }
    }
}
