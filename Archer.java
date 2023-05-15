import java.util.Random;

public class Archer extends Warrior<Bow,Shield>{
    public Archer(String name, Bow bow, int healthPoint, Offhand offhand) {
        super(name, bow, healthPoint, offhand);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}