public class Spear implements Weapon {

    @Override
    public int damage() {
        return 22;
    }
    
    public int range(){
        return 10;
    }

    @Override
    public String toString() {
        return String.format("Spear, max damage %d, max range %d", damage(), range());
    }
}
