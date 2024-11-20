package Behavioral.Strategy;

public class FastGrowth implements GrowthBehavior {

    @Override
    public void grow() {
        System.out.println("The sunflower is growing quickly!!!");
    }
}