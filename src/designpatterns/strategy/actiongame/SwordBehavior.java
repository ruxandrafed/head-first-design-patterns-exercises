package designpatterns.strategy.actiongame;

public class SwordBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("I'm fighting with a sword!");
    }
}