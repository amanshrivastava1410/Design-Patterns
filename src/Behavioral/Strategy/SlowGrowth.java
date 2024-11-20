package Behavioral.Strategy;

public class SlowGrowth implements GrowthBehavior {

    @Override
    public void grow() {
        System.out.println("The sunflower is growing slowly....");
    }
}