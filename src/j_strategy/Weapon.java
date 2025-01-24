package j_strategy;

public interface Weapon {
    int calAttackWeight(int damage);
    int calDefenceWeight(int damage);
    void attack();
}
