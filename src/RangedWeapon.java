public class RangedWeapon extends Weapon{
    private int ammo;

    public RangedWeapon(String longName, String shortName, double damage, int ammo){
        super(longName, shortName, damage);
        this.ammo=ammo;
    }

    public boolean canUse(){
        return ammo > 0;
    }

   public String attack(){
        if(canUse()){
            ammo--;
            return "You fire the " + super.getShortName() + ". Shots left " + ammo;
        } else {
            return "The " + super.getShortName() + " is out of ammo";
        }
   }

   public int getAmmo(){
        return ammo;
   }

}
