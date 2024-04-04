import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutoHuurTest {
    private Klant k;
    private Auto a;
    private AutoHuur ah;

    @BeforeEach
    public void init(){
        System.out.println();
        System.out.println("init");
        a = new Auto("Peugeot 207", 50);
        k = new Klant("Mijnheer de Vries");
        ah = new AutoHuur();

    }
    @Test
    public void test_Natuurlijkgetalprijsperdag(){
        System.out.println("test_Natuurlijkgetalprijsperdag");
        a.setPrijsPerDag(50);
        assertEquals(50,a.getPrijsPerDag());
    }

    @Test
    public void test_negatiefprijsperdag_prijsnul(){
        System.out.println("test_negatiefprijsperdag_prijsnul");
        a.setPrijsPerDag(-50);
        assertEquals(0,a.getPrijsPerDag());
    }

    @Test
    public void test_NatuurlijkgetalAantalDagen(){
        System.out.println("test_NatuurlijkgetalAantalDagen");
        ah.setAantalDagen(1);
        assertEquals(1,ah.getAantalDagen());
    }

    @Test
    public void test_NegatiefAantalDagen_Aantaldagennul(){
        System.out.println("test_NegatiefAantalDagen");
        ah.setAantalDagen(-1);
        assertEquals(0,ah.getAantalDagen());
    }

    @Test
    public void test_NatuurlijkgetalKorting(){
        System.out.println("test_NatuurlijkgetalKorting");
        k.setKorting(10.0);
        assertEquals(10.0,k.getKorting());
    }

    @Test
    public void test_negatiefKorting_positiefkorting(){
        System.out.println("test_negatiefKorting_positiefkorting");
        k.setKorting(-50);
        assertEquals(50,k.getKorting());
    }

    @Test
    public void test_welhuurderwelauto(){
        System.out.println("test_huurderauto_totaalprijs");
        ah.setAantalDagen(1);
        ah.setGehuurdeAuto(a);
        ah.setHuurder(k);
        assertEquals(50,ah.totaalPrijs());
        System.out.print("test_huurderauto_tostring");
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "op naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                "aantal dagen: 1 en dat kost 50.0",String.valueOf(ah));
    }

    @Test
    public void test_welhuurdergeenauto() {
        System.out.println("test_welhuurdergeenauto_totaalprijs");
        ah.setAantalDagen(1);
        ah.setHuurder(k);
        assertEquals(0, ah.totaalPrijs());
        System.out.print("test_welhuurdergeenauto_tostring");
        assertEquals("er is geen auto bekend\n" +
                "op naam van: Mijnheer de Vries (korting: 0.0%)\n" +
                "aantal dagen: 1 en dat kost 0.0", String.valueOf(ah));
    }

    @Test
    public void test_geenhuurderwelauto(){
        System.out.println("test_geenhuurderwelauto_totaalprijs");
        ah.setAantalDagen(1);
        ah.setGehuurdeAuto(a);
        assertEquals(0, ah.totaalPrijs());
        System.out.print("test_geenhuurderwelauto_tostring");
        assertEquals("autotype: Peugeot 207 met prijs per dag: 50.0\n" +
                "er is geen huurder bekend\n" +
                "aantal dagen: 1 en dat kost 0.0", String.valueOf(ah));
    }
    @Test
    public void test_geenhuurdergeenauto(){
        System.out.println("test_geenhuurdergeenauto_totaalprijs");
        ah.setAantalDagen(1);
        assertEquals(0, ah.totaalPrijs());
        System.out.print("test_geenhuurdergeenauto_tostring");
        assertEquals("er is geen auto bekend\n" +
                "er is geen huurder bekend\n" +
                "aantal dagen: 1 en dat kost 0.0", String.valueOf(ah));
}

}