import java.util.Random;

public class Trooper extends Warrior<Spear,GreatShield>{
    public Trooper(String name, Spear spear, int healthPoint, GreatShield greatShield){
        super(name, spear, healthPoint, greatShield);

    }

int range(){
    Random random = new Random();
    return random.nextInt(weapon.range());
}

@Override
public String toString() {
    return String.format("Trooper %s", super.toString());
}

}