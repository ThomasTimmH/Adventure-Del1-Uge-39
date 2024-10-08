public class Liquid extends Item{
    private double healthOrDamage;

    public Liquid(String longName, String shortName, double healthOrDamage){
        super(longName, shortName);
        this.healthOrDamage=healthOrDamage;
    }
    public double getHealthOrDamage() {
        return healthOrDamage;
    }
}
