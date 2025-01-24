package i_templatemethod;

public class Monster extends AbstractCharactor{
    public Monster(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
    }

    @Override
    protected int calAttackWeight(int damage) {
        return damage;
    }

    @Override
    protected int calDefenseWeight(int damage) {
        return damage;
    }
}
