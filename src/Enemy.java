import java.util.ArrayList;

public class Enemy {
    private String name;
    private double health;
    private Weapon equippedWeapon;

    public Enemy(String name, double health, Weapon equippedWeapon){
        this.name=name;
        this.health=health;
        this.equippedWeapon= equippedWeapon;
    }
    public void reduceHealth(double damage){
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
    }

    public boolean isDead(){
        return health <= 0;
    }

    public String getName(){
        return name;
    }

    public double getHealth() {
        return health;
    }

    public Weapon getEquippedWeapon() {
        return equippedWeapon;
    }

    public String attack(Player player){
        player.takeDamage(equippedWeapon.getDamage());
        return name + " attacks you and dealt" + equippedWeapon.getDamage() + " damage";
    }

    public String toString(){
        return name + " (Health:" + health + ", Weapon: " + equippedWeapon.getShortName() +  ")";
    }

}
