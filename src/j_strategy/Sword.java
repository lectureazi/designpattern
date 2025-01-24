package j_strategy;

public class Sword implements Weapon{

    private String name;
    private int atkWeight;
    private int defWeight;

    public Sword(String name, int atkWeight, int defWeight) {
        this.name = name;
        this.atkWeight = atkWeight;
        this.defWeight = defWeight;
    }

    @Override
    public int calAttackWeight(int damage) {
        return (int) (damage * atkWeight * 1.3);
    }

    @Override
    public int calDefenceWeight(int damage) {
        return (int) (damage * defWeight * 1.1);
    }

    @Override
    public void attack() {
        System.out.println(name + "이 날카롭게 적을 가릅니다.");
    }
}
