//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(WeaponType.STAFF, "STAFF");
        Boss boss = new Boss("Alex", 200, 50,weapon);
        System.out.println(boss.printInfo());

        Skeleton skeleton1 = new Skeleton("Ric", 50, 60, new Weapon(WeaponType.BOW, "BOW"),50);
        Skeleton skeleton2 = new Skeleton("Rici", 50, 60, new Weapon(WeaponType.SWORD, "Sword"), 50);

        System.out.println("Skeleton1" + skeleton1.printInfo());
        System.out.println("Skeleton2" + skeleton2.printInfo());
    }
}