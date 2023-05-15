public class Battle {
    private Warrior one;
    private Warrior two;

    public Battle(Warrior one, Warrior two) {
        this.one = one;
        this.two = two;
        
    }
    public Warrior fight() {
        while(one.getHealthPoint() > 0 && two.getHealthPoint() > 0){
            int hitOne = one.hit();
            System.out.printf("First warrior hits for %s damage. \n", hitOne);
            two.setHealthPoint(two.getHealthPoint() - hitOne);
            System.out.printf("Second warrior has %s healthPoints. \n", two.getHealthPoint());
            if(two.getHealthPoint() <= 0){
                return one;
            }
            int hitTwo = two.hit();
            System.out.printf("Second warrior hits for %s damage. \n", hitTwo);
            one.setHealthPoint(one.getHealthPoint() - hitTwo);
            System.out.printf("Fiest warrior has %s healthPoints. \n", one.getHealthPoint());
        }
        return two;
    }
}