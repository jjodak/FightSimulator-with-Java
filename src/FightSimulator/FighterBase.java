package FightSimulator;

abstract class FighterBase {

    String name;
    double maxHp, hp, maxMp, mp, atk, def, spd;

    public FighterBase(String name, double maxHp, double maxMp, double atk, double def) {
        this.name = name;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.atk = atk;
        this.def = def;
        this.hp = maxHp;
        this.mp = maxMp;
    }
}