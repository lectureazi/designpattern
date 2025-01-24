package j_strategy;

import i_templatemethod.AbstractCharactor;

public class Warrior extends AbstractCharactor {

    public Warrior(String name, int hp, int atk, int def) {
        super(name, hp, atk, def);
    }

    @Override
    protected int calAttackWeight(int damage) {
        return (int) (damage * 1.3);
    }

    @Override
    protected int calDefenseWeight(int damage) {
        return (int) (damage * 0.5);
    }
}
