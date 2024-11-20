package Creational.Builder;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private String interior;
    private String windows;
    private String doors;

    public House(String foundation, String structure, String roof, String interior, String windows, String doors) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.interior = interior;
        this.windows = windows;
        this.doors = doors;
    }

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public String getInterior() {
        return interior;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "House [Foundation = " + foundation + ", Structure = " + structure + ", Roof = " + roof + ", Interior = " + interior + ", Windows = " + windows + ", Doors = " + doors + "]";
    }
}
