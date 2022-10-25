public class ScienceManager {
    private int scienceGain;
    private int currentScience;
    private int scienceToLevel;

    BuildingManager buildingManager;

    public ScienceManager(int scienceGain, int currentScience, int scienceToLevel, BuildingManager buildingManager){
        this.scienceGain = scienceGain;
        this.currentScience = currentScience;
        this.scienceToLevel = scienceToLevel;
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
                if (i.getdestroyed()==false) {
                    this.scienceGain += i.getYield();
                }
            }
        }
        this.currentScience += this.scienceGain;


    }





}
