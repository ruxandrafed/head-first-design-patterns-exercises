package designpatterns.strategy.actiongame;

public abstract class Character {
    WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior wb) {
        weapon = wb;
    }

    public void fight() {
        weapon.useWeapon();
    }
}
