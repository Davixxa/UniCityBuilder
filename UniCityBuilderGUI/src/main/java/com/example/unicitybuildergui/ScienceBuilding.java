package com.example.unicitybuildergui;

public class ScienceBuilding extends Building {

    int range;

    public ScienceBuilding(int coordinate) {
        this.buildingCost = 50;
        this.currentLevel = 1;
        this.upgradeCost = 62;
        this.coordinate = coordinate;
        this.yield = 10;
        this.range = 10;
        this.destroyed = false;
        this.displayName = "The earth is flat, right?";
        this.pollution = 0;
        this.buildingType = BuildingTypes.SCIENCE;
        this.energyUpKeepCost = 5;

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


    @Override
    public void upgrade(MoneyManager moneyManager) {

        int newMoney = moneyManager.getCurrentMoney() - this.upgradeCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        }
        else {
            this.currentLevel++;
            this.yield += 5; // Placeholder
            this.displayName = "ok maybe it isn't";
            this.upgradeCost += 5; // Another placeholder.
            this.energyUpKeepCost += 5;
        }
    }
}
