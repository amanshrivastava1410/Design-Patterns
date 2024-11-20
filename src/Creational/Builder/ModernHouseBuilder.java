package Creational.Builder;

public class ModernHouseBuilder implements HouseBuilder {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private String windows;
    private String doors;

    @Override
    public void buildFoundation() {
        foundation = "Concrete Slab";
    }

    @Override
    public void buildStructure() {
        structure = "Steel Frame";
    }

    @Override
    public void buildRoof() {
        roof = "Flat Roof";
    }

    @Override
    public void buildInterior() {
        interior = "Modern Interior with open spaces";
    }

    @Override
    public void buildWindows() {
        windows = "Large Glass Windows";
    }

    @Override
    public void buildDoors() {
        doors = "Glass Doors";
    }

    @Override
    public House getHouse() {
        return new House(foundation, structure, roof, interior, windows, doors);
    }
}
