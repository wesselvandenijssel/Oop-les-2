public class Klant {
    private String naam;
    private double kortingsPercantage;

    public Klant(String nm){
        naam = nm;
    }

    public void setKorting(double kP){
        if (kP <0){
            kortingsPercantage = kP *-1;
        }
        else{
            kortingsPercantage = kP;
        }

    }

    public double getKorting(){
        return kortingsPercantage;
    }

    @Override
    public String toString(){
        return "op naam van: " + naam + " (korting: " + kortingsPercantage + "%)";
    }
}
