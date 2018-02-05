package designpatterns.strategy.ducks;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quacking");
    }
}
