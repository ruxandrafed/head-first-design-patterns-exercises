package headfirst.designpatterns.ducks;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        System.out.println("Changing flying behavior for model duck ...");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
