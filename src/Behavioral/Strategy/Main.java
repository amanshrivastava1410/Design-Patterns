package Behavioral.Strategy;

public class Main {
    public static void main(String[] args) {
        Sunflower sunflower = new Sunflower(new FastGrowth(), new SpringBloom());
        sunflower.display();
        sunflower.performGrowth();
        sunflower.performBloom();

        System.out.println("\n---- Changing Behavior ----\n");

        sunflower.setGrowthBehavior(new SlowGrowth());
        sunflower.setBloomBehavior(new SummerBloom());
        sunflower.display();
        sunflower.performGrowth();
        sunflower.performBloom();
    }
}
