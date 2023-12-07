import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoHuurTest {

    @Test
    public void testAutoHuur() {
        AutoHuur autoHuur = new AutoHuur();

        assertEquals(0, autoHuur.getAantalDagen());
        assertEquals(null, autoHuur.getGehuurdeAuto());
        assertEquals(null, autoHuur.getHuurder());
        assertEquals("er is geen auto bekend\n" +
                "er is geen huurder bekend\n" +
                "aantal dagen: 0 en dat kost 0.0", autoHuur.toString());

        Auto auto = new Auto("Merk", 50.0);
        Klant klant = new Klant("John Doe", 10);

        autoHuur.setAantalDagen(5);
        autoHuur.setGehuurdeAuto(auto);
        autoHuur.setHuurder(klant);

        assertEquals(5, autoHuur.getAantalDagen());
        assertEquals(auto, autoHuur.getGehuurdeAuto());
        assertEquals(klant, autoHuur.getHuurder());
        assertEquals("Merk met prijs per dag: 50.0\n" +
                "John Doe (korting: 10.0%)\n" +
                "aantal dagen: 5 en dat kost 225.0", autoHuur.toString());
    }
}
