public class GreatShield implements Shield {

    @Override
    public int defence() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Great Shield, max protection: %d",defence());
    }
}
