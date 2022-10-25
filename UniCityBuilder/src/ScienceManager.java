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



}
