package com.example.unicitybuildergui;

public class MoneyBuilding extends Building {

    // The placeholder names in this class may or may not have various commie jokes in it.

    public int pollution;

    public MoneyBuilding(int coordinate) {
        this.buildingCost = 50;
        this.currentLevel = 1;
        this.upgradeCost = 62;
        this.coordinate = coordinate;
        this.yield = 150;
        this.destroyed = false;
        this.displayName = "Why don't we seize the memes of production already? :^)";
        this.pollution = 2000;
        this.buildingType = BuildingTypes.MONEY;
        this.moneyUpKeepCost = 100;
        this.energyUpKeepCost = 5 * currentLevel;

    }


    public int getPollutionYield() {
        return pollution;
    }

    public void setPollutionYield(int pollution) {
        this.pollution = pollution;
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
            this.displayName = "Karl Marx is disappointed in you. Overthrow the bourgeois!";
            this.upgradeCost += 5; // Another placeholder.
        }
    }

}
