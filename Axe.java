public class Axe implements Weapon {

    @Override
    public int damage() {
       return 20;
    }
    @Override
    public String toString() {
        return String.format("Axe, max damage %d", damage());
    }
}
