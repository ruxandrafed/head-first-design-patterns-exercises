package designpatterns.strategy.actiongame;

public class BowAndArrowBehavior implements WeaponBehavior {
    public void useWeapon() {
        System.out.println("I'm fighting with a bow and arrow!");
    }
}