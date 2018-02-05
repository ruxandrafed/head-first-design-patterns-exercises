package designpatterns.strategy.ducks;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("Flying with a rocket");
    }
}
