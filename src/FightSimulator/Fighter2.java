package FightSimulator;

public class Fighter2 extends FighterBase implements Skillset {

    public Fighter2(String name, int maxHp, int maxMp, int atk, int def, int spd) {
        super(name, maxHp, maxMp, atk, def, spd);
        hp = maxHp;
        mp = maxMp;
    }

    @Override
    public void skill1(FighterBase target) {
        System.out.println(name + "skill1 사용!");
        target.hp -= (atk * 3);
        mp -= 10;
    }

    @Override
    public void skill2(FighterBase target) {
        System.out.println(name + "skill2 사용!");
        target.hp -= (atk * 5);
        mp -= 20;
    }

    @Override
    public void defenseskill() {
        System.out.println(name + "defenseskill 사용!");
        def += 10;
        mp -= 15;
    }

    @Override
    public void heal() {
        System.out.println(name + "heal 사용!");
        hp += 20;
        mp -= 10;
    }
}
