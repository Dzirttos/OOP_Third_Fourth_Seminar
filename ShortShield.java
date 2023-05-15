public class ShortShield implements Shield {

    @Override
    public int defence() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Short Shield, max protection: %d",defence());
    }    
}
