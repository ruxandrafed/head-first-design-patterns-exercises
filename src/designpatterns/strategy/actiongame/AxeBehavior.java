package designpatterns.strategy.actiongame;

public class AxeBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("I'm fighting with an axe!");
    }
}