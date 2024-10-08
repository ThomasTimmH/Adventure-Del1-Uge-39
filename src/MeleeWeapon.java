public class MeleeWeapon extends Weapon{

    public MeleeWeapon(String longName, String shortName, double damage){
        super(longName, shortName, damage);

    }

    public boolean canUse(){
        return true;
    }

    public String attack(){
        return "You swing " +super.getShortName() + " at the air";
    }

}
