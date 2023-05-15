import java.util.Random;

public class Trooper extends Warrior<Spear,GreatShield>{
    public Trooper(String name, Spear spear, int healthPoint, GreatShield greatShield){
        super(name, spear, healthPoint, greatShield);

    }

int defence(){
    Random random = new Random();
    return random.nextInt(shield.defence());
  
}

@Override
public String toString() {
    return String.format("Trooper %s", super.toString());
}

}