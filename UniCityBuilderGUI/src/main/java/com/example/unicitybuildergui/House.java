package com.example.unicitybuildergui;

public class House extends Building {
    //Constructor for our house building and its basic stats
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
    public String upgrade(MoneyManager manager) {
        return "Houses cannot be upgraded."; // Houses can't be upgraded, dummy method
    }
}
