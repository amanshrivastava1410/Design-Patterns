package Creational.Builder;

public class HouseDirector {
    private HouseBuilder builder;

    public HouseDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public void constructHouse() {
        builder.buildFoundation();
        builder.buildStructure();
        builder.buildRoof();
        builder.buildInterior();
        builder.buildWindows();
        builder.buildDoors();
    }

    public House getHouse() {
        return builder.getHouse();
    }
}
