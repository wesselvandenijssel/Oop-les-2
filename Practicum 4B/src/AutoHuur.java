public class AutoHuur {
    private int aantalDagen;
    private Klant huurder;
    private Auto gehuurdeAuto;

    public void setAantalDagen(int aD) {
        this.aantalDagen = aD;
    }
    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
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
}
