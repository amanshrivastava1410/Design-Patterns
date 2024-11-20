package Structural.Flyweight;

public class ConcreteSoldierFlyweight implements SoldierFlyweight {
    private String type;
    private String rank;  

    public ConcreteSoldierFlyweight(String type, String rank) {
        this.type = type;
        this.rank = rank;
    }

    @Override
    public void displaySoldierInfo(String position, int health) {
        System.out.println("Soldier Type: " + type + ", Rank: " + rank + ", Position: " + position + ", Health: " + health);
    }
}

