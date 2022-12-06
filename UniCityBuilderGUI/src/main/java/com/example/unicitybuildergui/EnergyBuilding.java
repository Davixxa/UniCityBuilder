package com.example.unicitybuildergui;

public class EnergyBuilding extends Building {

    //Variable
    private int pollution;
    //Constructor
    public EnergyBuilding(int coordinate) {
        this.buildingCost = 200;
        this.currentLevel = 1;
        this.upgradeCost = 200;
        this.coordinate = coordinate;
        this.yield = 5;
        this.pollution = 60;
        this.destroyed = false;
        this.displayName = "Coal Power Facility";
        this.buildingType = BuildingTypes.ENERGY;
        this.moneyUpKeepCost = 20;
        this.energyUpKeepCost = 0;

    }

    public int getPollutionYield() {
        return pollution;
    }

    public void setPollutionYield(int pollution) {
        this.pollution = pollution;
    }

    @Override
    //Upgrade function
    public String upgrade(MoneyManager moneyManager) {
        //Sets a new value for your money
        //gives you a message if you dont have enough money to upgrade, or else it upgrades
        int newMoney = moneyManager.getCurrentMoney() - this.upgradeCost;
        if (newMoney < 0) {
            return "Error: Insufficient funds";
        } else {
            moneyManager.setCurrentMoney(newMoney);
            this.currentLevel++;
            this.yield += 5;
            this.upgradeCost += 100;
            this.pollution += 30;
            if (this.currentLevel == 2) {
                this.displayName = "Power Plant";
            }
            else if (this.currentLevel == 3) {
                this.displayName = "Renewable Energy Facility";
                this.pollution = 0;
                this.yield = 20;
            }
            // Return value is error message.
            return null;
        }


    }
}
