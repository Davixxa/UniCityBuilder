public class InfastructureManager {

    //Variables
    public int level = 1;
    public int upgradeCost;
    public int repairCost;
    public boolean isDamaged;

    //Constructor
    public InfastructureManager(){

    }

    //Methods
    public void upgrade(int upgradeCost){
        this.upgradeCost = upgradeCost;
    }

    public void damage(boolean isDamaged){
        this.isDamaged = isDamaged;
    }

    public void repair(int repairCost){
        this.repairCost = repairCost;
    }

}
