package com.example.javafxbuilder;

public class EnergyBuilding extends Building {


    private int pollution;

    public EnergyBuilding(int coordinate) {
        this.buildingCost = 1048596;
        this.currentLevel = 1;
        this.upgradeCost = 10848596;
        this.coordinate = coordinate;
        this.yield = 1048596;
        this.pollution = 1048596;
        this.destroyed = false;
        this.displayName = "Global warming is a myth, obviously.";
        this.buildingType = BuildingTypes.ENERGY;
        this.moneyUpKeepCost = 100;

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
        } else {
            this.currentLevel++;
            this.yield += 5; // Placeholder
            this.displayName = "So what it isn't a myth? Doesn't matter. A few degrees warmer summer never hurt anyone!";
            this.upgradeCost += 5; // Another placeholder.
        }


    }
}
