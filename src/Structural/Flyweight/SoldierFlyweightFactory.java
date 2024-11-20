package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFlyweightFactory {
    private Map<String, SoldierFlyweight> soldierFlyweights;

    public SoldierFlyweightFactory() {
        soldierFlyweights = new HashMap<>();
    }

    public SoldierFlyweight getSoldierFlyweight(String type, String rank) {
        String key = type + "-" + rank;
        
        if (!soldierFlyweights.containsKey(key)) {
            soldierFlyweights.put(key, new ConcreteSoldierFlyweight(type, rank));
            System.out.println("Created new soldier: " + type + " " + rank);
        } else {
            System.out.println("Reusing existing soldier: " + type + " " + rank);
        }
        return soldierFlyweights.get(key);
    }
}
