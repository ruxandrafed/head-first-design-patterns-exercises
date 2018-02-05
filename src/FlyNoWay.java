package headfirst.designpatterns.ducks;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("No flying");
    }
}
