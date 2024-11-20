package Structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        SoldierFlyweightFactory factory = new SoldierFlyweightFactory();
  
        SoldierFlyweight infantrySoldier = factory.getSoldierFlyweight("Infantry", "Sergeant");
        infantrySoldier.displaySoldierInfo("Position A1", 100);
        
        SoldierFlyweight sniperSoldier = factory.getSoldierFlyweight("Sniper", "Lieutenant");
        sniperSoldier.displaySoldierInfo("Position B3", 80);
        
        SoldierFlyweight infantrySoldier2 = factory.getSoldierFlyweight("Infantry", "Sergeant");
        infantrySoldier2.displaySoldierInfo("Position C2", 90);

        SoldierFlyweight sniperSoldier2 = factory.getSoldierFlyweight("Sniper", "Lieutenant");
        sniperSoldier2.displaySoldierInfo("Position D5", 70);
    }
}

