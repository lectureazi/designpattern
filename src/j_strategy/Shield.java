package j_strategy;

public class Shield implements Weapon{

    private String name;
    private int atkWeight;
    private int defWeight;

    public Shield(String name, int atkWeight, int defWeight) {
        this.name = name;
        this.atkWeight = atkWeight;
        this.defWeight = defWeight;
    }

    @Override
    public int calAttackWeight(int damage) {
        return (int) (damage * atkWeight * 0.5);
    }

    @Override
    public int calDefenceWeight(int damage) {
        return (int) (damage * defWeight * 0.3);
    }

    @Override
    public void attack() {
        System.out.println(name + "으로 적을 후려쳤습니다.");
    }
}
