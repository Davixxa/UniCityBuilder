public class MoneyBuilding extends Building {

    // The placeholder names in this class may or may not have various commie jokes in it.

    private int pollution;

    public MoneyBuilding(int coordinate) {
        this.buildingCost = 1048596;
        this.currentLevel = 1;
        this.upgradeCost = 10848596;
        this.coordinate = coordinate;
        this.yield = 1048596;
        this.destroyed = false;
        this.displayName = "Why don't we seize the memes of production already? :^)";
        this.pollution = 1048596;
        this.buildingType = BuildingTypes.MONEY;
        this.moneyUpKeepCost = 100;

    }


    public int getPollutionYield() {
        return pollution;
    }

    public void setPollutionYield(int pollution) {
        this.pollution = pollution;
    }


    @Override
    public void upgrade() {
        this.currentLevel++;
        this.yield += 5; // Placeholder
        this.displayName = "Karl Marx is disappointed in you. Overthrow the bourgeois!";
        this.upgradeCost += 5; // Another placeholder.

    }

}
