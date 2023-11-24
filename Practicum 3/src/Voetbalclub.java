public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    // Constructor
    public Voetbalclub(String naam) {
        this.naam = naam;

        if (naam == null || naam == "") {
            naam = "FC";
        }
//        this.naam = naam;
    }

    // Method to process the result
    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen++;

        } else if (ch == 'g') {
            aantalGelijk++;
        } else if (ch == 'v') {
            aantalVerloren++;
        }
    }

    // Method to calculate and return the total points
    public int aantalPunten() {
        return aantalGewonnen * 3 + aantalGelijk;
    }

    // Method to calculate and return the total number of gespeeld (played) matches
    public int aantalGespeeld() {
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    // toString method to display the details of the voetbalclub
    @Override
    public String toString() {
        return String.format("%-12s%3d%3d%3d%3d%3d", naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
    }
}
