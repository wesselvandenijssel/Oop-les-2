public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp, double prijsPerDag) {
        this.type = tp;
        this.prijsPerDag = prijsPerDag;
    }

    public double getPrijsPerDag() {
        return prijsPerDag;
    }

    public void setPrijsPerDag(double prPd) {
        this.prijsPerDag = prPd;
    }
    @Override
    public String toString() {
        return "autotype: " + type + " met prijs per dag: " + prijsPerDag;
    }
}
