package com.example.unicitybuildergui;

public class EnergyBuilding extends Building {

    //Variable
    private int pollution;
    //Constructor
    public EnergyBuilding(int coordinate) {
        this.buildingCost = 50;
        this.currentLevel = 1;
        this.upgradeCost = 62;
        this.coordinate = coordinate;
        this.yield = 5;
        this.pollution = 10;
        this.destroyed = false;
        this.displayName = "Global warming is a myth, obviously.";
        this.buildingType = BuildingTypes.ENERGY;
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
    //Upgrade function
    public void upgrade(MoneyManager moneyManager) {
        //Sets a new value for your money
        //gives you a message if you dont have enough money to upgrade, or else it upgrades
        int newMoney = moneyManager.getCurrentMoney() - this.upgradeCost;
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        } else {
            this.currentLevel++;
            this.yield += 5; // Placeholder
            this.displayName = "So what it isn't a myth? Doesn't matter. A few degrees warmer summer never hurt anyone!";
            this.upgradeCost += 5; // Another placeholder.

            if(this.currentLevel < 3){
                this.energyUpKeepCost += 5;
            }

        }


    }
}
