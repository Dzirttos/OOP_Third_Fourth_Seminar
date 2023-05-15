public class Assassin extends Warrior<Knife>{

    public Assassin(String name, Knife knife, int healthPoint) {
        super(name, knife, healthPoint);
    }
    
    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}