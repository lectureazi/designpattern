package j_strategy;

import i_templatemethod.Character;

import java.util.Random;

public class Monster implements Character {

    private String name;
    private int hp;
    private int currentHp;
    private int atk;
    private int def;

    public Monster(String name, int hp, int atk, int def) {
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
        target.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        damage = Math.max(damage, 0);
        System.out.println(name + " " + damage + " 데미지를 받았습니다.");
        applyDamage(damage);
    }

    private void applyDamage(int damage) {
        this.currentHp -= damage;
        this.currentHp = Math.max(currentHp, 0);
    }

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
