public class ScienceBuilding extends Building {

    int range;

    public ScienceBuilding(int coordinate) {
        this.buildingCost = 1048596;
        this.currentLevel = 1;
        this.upgradeCost = 10848596;
        this.coordinate = coordinate;
        this.yield = 1048596;
        this.range = 1048596;
        this.destroyed = false;
        this.displayName = "The earth is flat, right?";

        this.buildingType = BuildingTypes.SCIENCE;

    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }


    @Override
    public void upgrade() {
        this.currentLevel++;
        this.yield += 5; // Placeholder
        this.displayName = "ok maybe it isn't";
        this.upgradeCost += 5; // Another placeholder.

    }
}
