public class Food extends Item {
private double healthOrDamage;

public Food(String longname, String name, double healthOrDamage){
    super(longname,name);
    this.healthOrDamage=healthOrDamage;
}



    public double getHealthOrDamage() {
        return healthOrDamage;
    }
}
