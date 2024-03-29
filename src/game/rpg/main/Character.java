package game.rpg.main;

public abstract class Character {

    // Variables / Attributes all character have
    public String name;
    public int maxHp, hp, xp;

    // Constructor for character
    public Character(String name, int maxHp, int xp) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.xp = xp;
    }

    // Player specific methods
    public abstract int attack();

    public abstract int defend();

    // methods every character have
    //public abstract int attack();
    //public abstract int defend();
}
