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


}
