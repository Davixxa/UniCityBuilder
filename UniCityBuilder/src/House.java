public class House extends Building {

    public House(int coordinate) {
        this.buildingType = BuildingTypes.HOUSE;
        this.coordinate = coordinate;
    }

    @Override
    public void upgrade() {
        // Houses can't be upgraded, dummy method
    }
}
