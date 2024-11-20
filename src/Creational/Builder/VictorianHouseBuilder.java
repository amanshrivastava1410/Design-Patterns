package Creational.Builder;

public class VictorianHouseBuilder implements HouseBuilder {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private String windows;
    private String doors;

    @Override
    public void buildFoundation() {
        foundation = "Stone Foundation";
    }

    @Override
    public void buildStructure() {
        structure = "Wooden Frame";
    }

    @Override
    public void buildRoof() {
        roof = "Sloped Roof with shingles";
    }

    @Override
    public void buildInterior() {
        interior = "Victorian-style ornate interior";
    }

    @Override
    public void buildWindows() {
        windows = "Small, traditional windows with wooden frames";
    }

    @Override
    public void buildDoors() {
        doors = "Wooden Doors with carvings";
    }

    @Override
    public House getHouse() {
        return new House(foundation, structure, roof, interior, windows, doors);
    }
}
