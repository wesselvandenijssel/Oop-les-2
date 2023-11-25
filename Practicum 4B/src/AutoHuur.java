public class AutoHuur {
    private int aantalDagen;
    private Auto gehuurdeAuto;
    private Klant huurder;

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public void setGehuurdeAuto(Auto auto) {
        this.gehuurdeAuto = auto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    @Override
    public String toString() {
        if (gehuurdeAuto == null && huurder == null) {
            return "er is geen auto bekend\n" + "er is geen huurder bekend\n" +
                    "aantal dagen: " + aantalDagen + " en dat kost " + berekenKosten();
        } else if (gehuurdeAuto == null) {
            return "er is geen auto bekend\n" + huurder + "\n" +
                    "aantal dagen: " + aantalDagen + " en dat kost " + berekenKosten();
        } else {
            return gehuurdeAuto + "\n" + (huurder == null ? "er is geen huurder bekend" : huurder) +
                    "\n" + "aantal dagen: " + aantalDagen + " en dat kost " + berekenKosten();
        }
    }

    private double berekenKosten() {
        if (gehuurdeAuto == null || huurder == null) {
            return 0.0;
        }
        return aantalDagen * gehuurdeAuto.getPrijsPerDag() * (1 - huurder.getKorting() / 100);
    }
}