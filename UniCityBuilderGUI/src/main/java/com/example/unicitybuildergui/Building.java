package com.example.unicitybuildergui;

abstract class Building {


    BuildingTypes buildingType;

    int buildingCost;
    int upgradeCost;
    boolean destroyed;
    int coordinate;
    int currentLevel;
    int yield;

    int moneyUpKeepCost;

    int energyUpKeepCost;

    String displayName;

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

    // Concrete
    public boolean isDestroyed() {
        return destroyed;
    }

    public void repair(MoneyManager moneyManager) {
        int newMoney = moneyManager.getCurrentMoney() - upgradeCost;
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
    public abstract void upgrade(MoneyManager moneyManager);
    // Upgrade gør også at den koster mere i upKeepCost. (Oliver Larsen)

    // Concrete - Doesn't immediately make sense to have
    //public abstract void remove();


}
