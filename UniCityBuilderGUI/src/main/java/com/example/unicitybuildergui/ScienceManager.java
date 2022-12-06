package com.example.unicitybuildergui;

public class ScienceManager {
    //Variables
    private int scienceGain;
    private int currentScience;
    private int scienceToLevel;
    private int scienceLevel;

    BuildingManager buildingManager;
    //Constructor with base stats at the start of game and the requirements for a level up
    public ScienceManager(BuildingManager buildingManager){
        this.scienceGain = 0;
        this.currentScience = 0;
        this.scienceToLevel = 10;
        this.buildingManager = buildingManager;
        this.scienceLevel = 1;
    }

    public int getCurrentScience() {
        return currentScience;
    }

    public void setCurrentScience(int currentScience) {
        this.currentScience = currentScience;
    }
    
    public int getScienceGain() {
        return scienceGain;
    }

    public void setScienceGain(int scienceGain) {
        this.scienceGain = scienceGain;
    }

    public int getScienceToLevel() {
        return scienceToLevel;
    }

    public void setScienceToLevel(int scienceToLevel) {
        this.scienceToLevel = scienceToLevel;
    }

    public int getScienceLevel() {
        return scienceLevel;
    }
    //Calculates our science gain per turn.
    public void calcScienceGain(EnergyManager energyManager) {
        this.scienceGain = 0;
        for (Building i : buildingManager.map.values()) {
            if (i.getBuildingType() == BuildingTypes.SCIENCE) {
                if (i.isDestroyed()==false) {
                    if(energyManager.getCurrentEnergy()>0) {
                        this.scienceGain += i.getYield();
                    }
                }
            }
        }
        this.currentScience += this.scienceGain;
        if (currentScience >= scienceToLevel){
            currentScience = 0;
            scienceLevel++;
            scienceToLevel += 100;
        }


    }





}
