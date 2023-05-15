import java.util.Random;

public abstract class Warrior<T extends Weapon, U extends Shield> {
    private String name;

    protected T weapon;

    public T getWeapon() {
        return weapon;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    protected U shield;
    

    public void setShield(U shield) {
        this.shield = shield;
    }

    public U getShield() {
        return shield;
    }

    private int healthPoint;

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    // public Warrior(String name, T weapon, int healthPoint) {
    //     this.name = name;
    //     this.weapon = weapon;
    //     this.healthPoint = healthPoint;
    // }

    public Warrior(String name, T weapon, int healthPoint, U shield) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d, offhand %s", name, weapon, healthPoint, shield);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(((Weapon)weapon).damage());
    }

    public int block(){
        Random random = new Random();
        if(shield == null) return 0;
        else
        return random.nextInt(((Shield)shield).defence());
    }
}