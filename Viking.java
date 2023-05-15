public class Viking extends Warrior<Axe, ShortShield>{
    public Viking(String name, Axe axe, int healthPoint, ShortShield shortShield){
        super(name, axe, healthPoint, shortShield);
    }    
    @Override
    public String toString() {
        return String.format("Viking %s", super.toString());
    }
}
