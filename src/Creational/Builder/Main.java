package Creational.Builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        HouseDirector director = new HouseDirector(modernHouseBuilder);
        director.constructHouse();
        House modernHouse = director.getHouse();
        System.out.println("Modern House built: " + modernHouse);

        HouseBuilder victorianHouseBuilder = new VictorianHouseBuilder();
        HouseDirector victorianDirector = new HouseDirector(victorianHouseBuilder);
        victorianDirector.constructHouse();
        House victorianHouse = victorianDirector.getHouse();
        System.out.println("Victorian House built: " + victorianHouse);
    }
}
