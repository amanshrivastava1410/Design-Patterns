package Behavioral.Strategy;

public class Sunflower {
    private GrowthBehavior growthBehavior;
    private BloomBehavior bloomBehavior;

    public Sunflower(GrowthBehavior growthBehavior, BloomBehavior bloomBehavior) {
        this.growthBehavior = growthBehavior;
        this.bloomBehavior = bloomBehavior;
    }

    public void performGrowth() {
        growthBehavior.grow();
    }

    public void performBloom() {
        bloomBehavior.bloom();
    }

    public void setGrowthBehavior(GrowthBehavior growthBehavior) {
        this.growthBehavior = growthBehavior;
    }

    public void setBloomBehavior(BloomBehavior bloomBehavior) {
        this.bloomBehavior = bloomBehavior;
    }

    public void display() {
        System.out.println("This is a sunflower.");
    }
}