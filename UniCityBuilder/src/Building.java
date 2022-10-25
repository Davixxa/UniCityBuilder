abstract class Building {
    public enum buildingType {
        MONEY,
        SCIENCE,
        ENERGY,
        HOUSE
    }

    int buildingCost;
    int upgradeCost;
    boolean destroyed;
    int coordinate;
    int currentLevel;
    int yield;

    String displayName;

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
    public int getBuildingCost(){
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

    // Make upgrade cost more expensive, increase yield, level++
    public abstract void upgrade();

    // Concrete - Doesn't immediately make sense to have
    //public abstract void remove();




}
