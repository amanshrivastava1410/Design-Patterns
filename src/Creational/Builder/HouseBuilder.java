package Creational.Builder;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    void buildWindows();
    void buildDoors();
    House getHouse();
}
