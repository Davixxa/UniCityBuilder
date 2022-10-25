public class House extends Building {

    public House() {
        this.buildingType = BuildingTypes.HOUSE;
    }

    @Override
    public void upgrade() {
        // Houses can't be upgraded, dummy method
    }
}
