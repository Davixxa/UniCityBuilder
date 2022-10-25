public class ScienceManager {
    private int scienceGain;
    private int currentScience;
    private int scienceToLevel;

    public ScienceManager(int scienceGain, int currentScience, int scienceToLevel){
        this.scienceGain = scienceGain;
        this.currentScience = currentScience;
        this.scienceToLevel = scienceToLevel;
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
        for (Building i; BuildingManager.Map.values()) {
            if (i.getBuildingType == BuildingTypes.SCIENCE) {
                if (i.getdestroyed()==false) {
                    this.scienceGain += i.getYield();
                }
            }
        }
        this.currentScience += this.scienceGain;


    }





}
