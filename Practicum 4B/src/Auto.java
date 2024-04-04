public class Auto {
    private String type;
    private double prijsPerDag;

    public Auto(String tp,double prPd){
        type = tp;
        if(prPd < 0){
            prijsPerDag = 0;
        }
        else{
            prijsPerDag =prPd;
        }
    }

    public void setPrijsPerDag(double prPd){
        if(prPd < 0){
            prijsPerDag = 0;
        }
        else{
            prijsPerDag =prPd;
        }
    }

    public double getPrijsPerDag(){
        return prijsPerDag;
    }

    @Override
    public String toString(){
        return "autotype: " + type + " met prijs per dag: " + prijsPerDag;
    }




}
