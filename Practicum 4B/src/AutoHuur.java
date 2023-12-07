public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gA) {
        this.gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k) {
        this.huurder = k;
    }

    public Klant getHuurder() {
        return huurder;
    }

    @Override
    public String toString() {
        if (gehuurdeAuto == null && huurder == null) {
            return "er is geen auto bekend\n" + "er is geen huurder bekend\n" +
                    "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        } else if (gehuurdeAuto == null) {
            return "er is geen auto bekend\n" + huurder + "\n" +
                    "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        } else {
            return gehuurdeAuto + "\n" + (huurder == null ? "er is geen huurder bekend" : huurder) +
                    "\n" + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
        }
    }

    private double totaalPrijs() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100);
    }
}