public class EnergyManager {
    private int energyGain;
    private int currentEnergy;
    private int energyDecay;
    private int energyUpkeep;


    public EnergyManager(int energyGain, int currentEnergy, int energyDecay, int energyUpkeep){
        this.energyGain = energyGain;
        this.currentEnergy = currentEnergy;
        this.energyDecay = energyDecay;
        this.energyUpkeep = energyUpkeep;
    }

    public int getCurrentEnergy() {
        return currentEnergy;
    }

    public void setCurrentEnergy(int currentEnergy) {
        this.currentEnergy = currentEnergy;
    }

    public int getEnergyDecay() {
        return energyDecay;
    }

    public void setEnergyDecay(int energyDecay) {
        this.energyDecay = energyDecay;
    }

    public int getEnergyGain() {
        return energyGain;
    }

    public void setEnergyGain(int energyGain) {
        this.energyGain = energyGain;
    }



    public void calcMoneyGain() {
        this.energyGain = 0;
        for (Building i; BuildingManager.Map.values()) {
            switch (i.getBuildingType) {

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

            if (i.getBuildingType == BuildingTypes.ENERGY) {
                if (i.getdestroyed() == false) {
                    this.energyGain += i.getYield();
                }
            }
        }
        this.energyGain -= this.energyUpkeep;
        this.currentEnergy += this.energyGain;
    }


}
