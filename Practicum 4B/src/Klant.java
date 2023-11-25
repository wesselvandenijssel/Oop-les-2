public class Klant {
    private String naam;
    private double korting;

    public Klant(String naam) {
        this.naam = naam;
        this.korting = 0.0;
    }

    public void setKorting(double korting) {
        this.korting = korting;
    }

    public double getKorting() {
        return korting;
    }

    @Override
    public String toString() {
        return "op naam van: " + naam + " (korting: " + korting + "%)";
    }
}
