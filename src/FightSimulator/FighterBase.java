package FightSimulator;

abstract class FighterBase {
    String name;
    int maxHp, hp, maxMp, mp, atk, def, spd;

    public FighterBase(String name, int maxHp, int maxMp, int atk, int def, int spd) {
        this.name = name;
        this.maxHp = maxHp;
        this.maxMp = maxMp;
        this.atk = atk;
        this.def = def;
        this.hp = maxHp;
        this.mp = maxMp;
        this.spd = spd;
    }
}