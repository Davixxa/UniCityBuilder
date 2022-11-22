package main.java.com.example.javafxbuilder;

import java.lang.Math;


public class EnergyManager {
    private int energyGain;
    private int currentEnergy;
    private float energyDecay;
    private int energyUpkeep;

    BuildingManager buildingManager;


    public EnergyManager(BuildingManager buildingManager){
        this.energyGain = 0;
        this.currentEnergy = 100;
        this.energyDecay = 0.9f;
        this.energyUpkeep = 0;
        this.buildingManager = buildingManager;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public double getEnergyDecay() {
        return energyDecay;
    }

    public void setEnergyDecay(float energyDecay) {
        this.energyDecay = energyDecay;
    }

    public int getEnergyGain() {
        return energyGain;
    }

    public void setEnergyGain(int energyGain) {
        this.energyGain = energyGain;
    }



    public void calcEnergyGain() {
        this.energyGain = 0;
        for (Building i : buildingManager.map.values()) {
            this.energyUpkeep += i.energyUpKeepCost;

            /*
            switch (i.getBuildingType()) {

                case BuildingTypes.MONEY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.energyUpkeep += 10;

                    break;

                case BuildingTypes.ENERGY:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.energyUpkeep += 10;

                    break;

                case BuildingTypes.HOUSE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.energyUpkeep += 10;

                    break;

                case BuildingTypes.SCIENCE:
                    // code block
                    // Hvor meget det koster at holde en bygning up. 10.
                    this.energyUpkeep += 10;

                    break;

                default:
                    // code block
            }

             */

            if (i.getBuildingType() == BuildingTypes.ENERGY) {
                if (i.isDestroyed() == false) {
                    this.energyGain += i.getYield();
                }
            }
        }
        this.energyGain -= this.energyUpkeep;
        this.currentEnergy += this.energyGain;
        this.currentEnergy = Math.round(this.currentEnergy * energyDecay);

    }


}
