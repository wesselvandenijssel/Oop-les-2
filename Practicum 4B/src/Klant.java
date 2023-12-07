public class Klant {
    private String naam;
    private double korting;

    public Klant(String nm) {
        this.naam = nm;
        this.korting = 0.0;
    }

    public void setKorting(double kP) {
        this.korting = kP;
    }

    public double getKorting() {
        return korting;
    }

    @Override
    public String toString() {
        return "op naam van: " + naam + " (korting: " + korting + "%)";
    }
}
