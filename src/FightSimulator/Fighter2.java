package FightSimulator;

public class Fighter2 extends FighterBase implements Skillset {

    public Fighter2(String name, double maxHp, double maxMp, double atk, double def) {
        super(name, maxHp, maxMp, atk, def);
    }

    @Override
    public void skill1(FighterBase target) {
        System.out.println(name + "의 skill1 사용!");
        double damage = ((atk * 0.2) * (1000 - target.def) / 1000);
        if (damage < 0) {
            damage = 0;
        }
        target.hp -= damage;
        if (target.hp < 0) {
            target.hp = 0;
        }
        mp -= 10;

        System.out.println(name + "가 " + target.name + "에게 공격 : " + damage + " | 잔여 마나 : " + mp);
    }

    @Override
    public void skill2(FighterBase target) {
        System.out.println(name + "의 skill2 사용!");
        double damage = ((atk * 0.2) * (1000 - target.def) / 1000);

        if (damage < 0) {
            damage = 0;
        }
        target.hp -= damage;
        if (target.hp < 0) {
            target.hp = 0;
        }
        mp -= 20;

        System.out.println(name + "가 " + target.name + "에게 공격 : " + damage + " | 잔여 마나 : " + mp);
    }

    @Override
    public void heal() {
        System.out.println(name + "의 heal 사용!");
        double heal = hp + 20;
        mp -= 30;

        System.out.println(name + "의 기존 체력 : " + hp + " | " + name + "의 체력 : " + heal + " | 잔여 마나 : " + mp);
    }
}
