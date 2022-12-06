package com.example.unicitybuildergui;

abstract class Building {

    //Variables
    BuildingTypes buildingType;

    int buildingCost;
    int upgradeCost;
    boolean destroyed;
    int coordinate;
    int currentLevel;
    int yield;
    int pollution;

    int moneyUpKeepCost;

    int energyUpKeepCost;

    String displayName;

    //Get and Set methods
    public int getPollutionYield() {
        return pollution;
    }
    public BuildingTypes getBuildingType() {
        return buildingType;
    }
    public void setBuildingType(BuildingTypes buildingType) {
        this.buildingType = buildingType;
    }
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String name) {
        this.displayName = name;
    }
    public int getYield() {
        return yield;
    }

    public void setCoordinate(int coordinate) {
        this.coordinate = coordinate;
    }
    public void setDestroyed(boolean destroyed) {
        this.destroyed = destroyed;

    }
    public int getUpgradeCost() {
        return upgradeCost;
    }
    public int getBuildingCost() {
        return buildingCost;
    }
    public int getCoordinate() {
        return coordinate;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    //if something is destroyed it returns a destroyed
    public boolean isDestroyed() {
        return destroyed;
    }
    // A function for our repair function
    public void repair(MoneyManager moneyManager) {
        int newMoney = moneyManager.getCurrentMoney() - upgradeCost;
        //checks for if you have enough money to repair a destroyed building
        if (newMoney < 0) {
            System.out.println("Error: Insufficient funds");
        } else {
            moneyManager.setCurrentMoney(newMoney);
            this.destroyed = false;
        }

    }

    public int getMoneyUpKeepCost() {
        return moneyUpKeepCost;
    }

    public void setMoneyUpKeepCost(int moneyUpKeepCost) {
        this.moneyUpKeepCost = moneyUpKeepCost;
    }

    public int getEnergyUpKeepCost() {
        return energyUpKeepCost;
    }

    // Make upgrade cost more expensive, increase yield, level++
    public abstract String upgrade(MoneyManager moneyManager);
    // Upgrade makes it so it costs 1 more in upKeepCost



}
