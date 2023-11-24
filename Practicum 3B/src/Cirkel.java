public class Cirkel {
    private int radius;
    private int xPositie;
    private int yPositie;

    // Constructor
    public Cirkel(int radius, int xPositie, int yPositie) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius moet groter dan 0 zijn!");
        }
        this.radius = radius;
        this.xPositie = xPositie;
        this.yPositie = yPositie;
    }
    @Override
    public String toString() {
        return "cirkel (" + xPositie + ".0, " + yPositie + ".0) met radius: " + radius + ".0";
    }
}
