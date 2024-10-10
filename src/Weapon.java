public abstract class Weapon extends Item {
    private double damage;

    public Weapon(String longName, String shortName, double damage) {
        super(longName, shortName);
        this.damage = damage;
    }

    public abstract boolean canUse();

    public abstract String attack();

    public double getDamage(){
        return damage;
    }
}
