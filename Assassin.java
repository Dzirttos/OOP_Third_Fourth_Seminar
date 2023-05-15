public class Assassin extends Warrior<Knife,Shield>{

    public Assassin(String name, Knife knife, int healthPoint) {
        super(name, knife, healthPoint, null);
    }
    
    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }
}