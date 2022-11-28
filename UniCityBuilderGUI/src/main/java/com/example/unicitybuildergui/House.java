package com.example.unicitybuildergui;

public class House extends Building {

    public House(int coordinate) {
        this.buildingCost = 100;
        this.moneyUpKeepCost = 5;
        this.energyUpKeepCost = 5;
        this.buildingType = BuildingTypes.HOUSE;
        this.coordinate = coordinate;
        this.currentLevel = 1;
    }

    @Override
    public void upgrade(MoneyManager manager) {
        // Houses can't be upgraded, dummy method
    }
}
