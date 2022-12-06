package com.example.unicitybuildergui;

public class House extends Building {

    public House(int coordinate) {
        this.buildingCost = 100;
        this.moneyUpKeepCost = 5;
        this.energyUpKeepCost = 5;
        this.buildingType = BuildingTypes.HOUSE;
        this.coordinate = coordinate;
        this.currentLevel = 1;
        this.pollution = 0;
        this.displayName = "House";
    }

    public int getPollutionYield() {
        return pollution;
    }

    @Override
    public void upgrade(MoneyManager manager) {
        // Houses can't be upgraded, dummy method
    }
}
