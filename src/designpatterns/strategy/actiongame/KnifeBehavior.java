package designpatterns.strategy.actiongame;

public class KnifeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("I'm fighting with a knife!");
    }
}
