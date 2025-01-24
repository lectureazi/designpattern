package i_templatemethod;

import java.util.Random;

public abstract class AbstractCharactor implements Character{
    private String name;
    private int hp;
    private int currentHp;
    private int atk;
    private int def;

    public AbstractCharactor(String name, int hp, int atk, int def) {
        this.name = name;
        this.hp = hp;
        this.currentHp = hp;
        this.atk = atk;
        this.def = def;
    }

    @Override
    public void attack(Character target) {
        Random random = new Random();
        int damage = random.nextInt(atk/2, atk*2);
        damage = calAttackWeight(damage);
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage = calDefenseWeight(damage);
        damage = Math.max(damage, 0);

        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        applyDamage(damage);
    }

    private void applyDamage(int damage) {
        this.currentHp -= damage;
        this.currentHp = Math.max(currentHp, 0);
    }

    protected abstract int calAttackWeight(int damage);
    protected abstract int calDefenseWeight(int damage);

    public String getName() {
        return name;
    }

    public boolean isDead(){
        return currentHp <= 0;
    };

    public int getCurrentHp(){
        return currentHp;
    };
}
