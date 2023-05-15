public class Offhand implements Shield {
    
    @Override
    public int defence() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("No shield, max protection: %d",defence());
    }    
}
