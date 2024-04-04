public class AutoHuur {
    private int aantaldagen;

    private Klant huurder;

    private Auto gehuurdeAuto;

    public AutoHuur(){

    }

    public void setAantalDagen(int aD){
        if(aD < 0){
            aantaldagen = 0;
        }
        else{
            aantaldagen =aD;
        }

    }

    public int getAantalDagen(){
        return aantaldagen;
    }

    public void setGehuurdeAuto(Auto gA){
        gehuurdeAuto = gA;
    }

    public Auto getGehuurdeAuto(){
        return gehuurdeAuto;
    }

    public void setHuurder(Klant k){
        huurder = k;
    }

    public Klant getHuurder(){
        return huurder;
    }

    public double totaalPrijs (){
        if(gehuurdeAuto == null){
            return 0;
        }
        else if(huurder == null){
            return 0;
        }
        else{
            return this.getAantalDagen() * (1-0.1*huurder.getKorting()) * gehuurdeAuto.getPrijsPerDag();
        }
    }

    @Override
    public String toString(){
        String gehuurde_auto;
        String gehuurddoor;
        double totaalkosten = 1;
        if (gehuurdeAuto == null){
            gehuurde_auto = "er is geen auto bekend";
            totaalkosten = 0;
        }
        else {
            gehuurde_auto = String.valueOf(gehuurdeAuto);
        }
        if (huurder == null){
            gehuurddoor = "er is geen huurder bekend";
            totaalkosten = 0;
        }
        else {
            gehuurddoor = String.valueOf(huurder);

        }
        if (totaalkosten != 0 ){
            totaalkosten = totaalPrijs();
        }

        return gehuurde_auto + "\n" + gehuurddoor + "\n" + "aantal dagen: " + aantaldagen + " en dat kost " + totaalkosten;
    }
}
