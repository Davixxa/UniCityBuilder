package com.example.javafxbuilder;

public class ScienceManager {
    private int scienceGain;
    private int currentScience;
    private int scienceToLevel;

    BuildingManager buildingManager;

    public ScienceManager(BuildingManager buildingManager){
        this.scienceGain = 0;
        this.currentScience = 100;
        this.scienceToLevel = 10;
        this.buildingManager = buildingManager;

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


    public void calcScienceGain() {
        this.scienceGain = 0;
        for (Building i : buildingManager.map.values()) {
            if (i.getBuildingType() == BuildingTypes.SCIENCE) {
                if (i.isDestroyed()==false) {
                    this.scienceGain += i.getYield();
                }
            }
        }
        this.currentScience += this.scienceGain;


    }





}
