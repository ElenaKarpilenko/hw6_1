public class Boss extends GameEntity {
    public Weapon weapon;

    public Boss(String name, int health, int damage, Weapon weapon) {
        super(name, health, damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Name: " + getName() + "Heals: " + getHealth() + "WeaponType: " + weapon.getWeaponType() + "WeaponName: " + weapon.getWeaponName();
    }
}
