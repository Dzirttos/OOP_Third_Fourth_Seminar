import java.util.Random;

public class Viking extends Warrior<Axe, ShortShield>{
    public Viking(String name, Axe axe, int healthPoint, ShortShield shortShield){
        super(name, axe, healthPoint, shortShield);
    }    

    int defence(){
        Random random = new Random();
        return random.nextInt(shield.defence());
      
    }

    @Override
    public String toString() {
        return String.format("Viking %s", super.toString());
    }
}
