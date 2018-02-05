package headfirst.designpatterns.actiongame;

public class ActionGameSimulator {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.setWeapon(new BowAndArrowBehavior());
        queen.fight();

        Character troll = new Troll();
        troll.setWeapon(new AxeBehavior());
        troll.fight();

        Character knight = new Knight();
        knight.setWeapon(new SwordBehavior());
        knight.fight();
    }
}
