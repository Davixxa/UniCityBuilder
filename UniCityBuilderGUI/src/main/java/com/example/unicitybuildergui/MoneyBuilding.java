package com.example.unicitybuildergui;

public class MoneyBuilding extends Building {

    // The placeholder names in this class may or may not have various commie jokes in it.

    public int pollution;
    //Constructor for money building and its basic stats
    public MoneyBuilding(int coordinate) {
        this.buildingCost = 200;
        this.currentLevel = 1;
        this.upgradeCost = 200;
        this.coordinate = coordinate;
        this.yield = 50;
        this.destroyed = false;
        this.displayName = "Street Market";
        this.pollution = 400;
        this.buildingType = BuildingTypes.MONEY;
        this.moneyUpKeepCost = 0;
        this.energyUpKeepCost = 10;

    }


    public int getPollutionYield() {
        return pollution;
    }

    public void setPollutionYield(int pollution) {
        this.pollution = pollution;
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
            this.yield += 50;
            this.upgradeCost += 100;
            this.energyUpKeepCost += 10;
            if (this.currentLevel == 2){
                this.displayName = "Convenience Store";
                this.pollution+=200;
            }
            else if (this.currentLevel == 3){
                this.displayName = "Stock Market";
                this.pollution=0;
            }
        }
    }

}
