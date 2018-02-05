package headfirst.designpatterns.ducks;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeaking");
    }
}