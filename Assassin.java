public class Assassin extends Warrior<Knife,Shield>{

    public Assassin(String name, Knife knife, int healthPoint, Offhand offhand) {
        super(name, knife, healthPoint, offhand);
    }
    
    @Override
    public String toString() {
        return String.format("Assassin %s", super.toString());
    }
}