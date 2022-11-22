package com.example.javafxbuilder;

public class House extends Building {

    public House(int coordinate) {
        this.buildingType = BuildingTypes.HOUSE;
        this.coordinate = coordinate;
    }

    @Override
    public void upgrade(MoneyManager manager) {
        // Houses can't be upgraded, dummy method
    }
}
