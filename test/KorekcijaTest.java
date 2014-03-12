
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class KorekcijaTest {
    
    public KorekcijaTest() {
    }
    
    public void testParnost() {
    assertEquals(1, Korekcija.parnost(5, 1, 7));
    assertEquals(0, Korekcija.parnost(9, 5, 2));
    assertEquals(0, Korekcija.parnost(11, 3, 2));
    assertEquals(1, Korekcija.parnost(5, 5, 13));
    assertEquals(0, Korekcija.parnost(14, 8, 2));
    assertEquals(1, Korekcija.parnost(5, 5, 2));
    assertEquals(0, Korekcija.parnost(3, 9, 8));
    assertEquals(1, Korekcija.parnost(2, 6, 9));
    assertEquals(1, Korekcija.parnost(5, 8, 22));
    assertEquals(0, Korekcija.parnost(17, 10, 53));
    }
    
    public void testVerifikuj() {
        
        int[] kod1 = {1, 0, 0, 1};
        int[] kod2 = {0, 1, 1, 1};
        int[] kod3 = {1, 0, 1, 1};
        int[] kod4 = {1, 1, 0, 1};
        int[] kod5 = {1, 1, 1, 1};
        Korekcija test1 = new Korekcija(kod1);
        Korekcija test2 = new Korekcija(kod2);
        test1.konstruisi();
        test2.konstruisi();
        
        test1.promeni(0);
        assertEquals(1, test1.verifikuj());
        test1.koriguj();
        test1.promeni(1);
        assertEquals(2, test1.verifikuj());
        test1.koriguj();
        test1.promeni(2);
        assertEquals(3, test1.verifikuj());
        test1.koriguj();
        test1.promeni(3);
        assertEquals(4, test1.verifikuj());
        test1.koriguj();
        test1.promeni(4);
        assertEquals(5, test1.verifikuj());
        test1.koriguj();
        test1.promeni(5);
        assertEquals(6, test1.verifikuj());
        test1.koriguj();
        test1.promeni(6);
        assertEquals(7, test1.verifikuj());
        
        test2.promeni(0);
        assertEquals(1, test2.verifikuj());
        test2.koriguj();
        test2.promeni(1);
        assertEquals(2, test2.verifikuj());
        test2.koriguj();
        test2.promeni(2);
        assertEquals(3, test2.verifikuj());
        test2.koriguj();
        test2.promeni(3);
        assertEquals(4, test2.verifikuj());
        test2.koriguj();
        test2.promeni(4);
        assertEquals(5, test2.verifikuj());
        test2.koriguj();
        test2.promeni(5);
        assertEquals(6, test2.verifikuj());
        test2.koriguj();
        test2.promeni(6);
        assertEquals(7, test2.verifikuj());
    }
    public void testKonstruisi() {
        int[] kod1 = {0, 0, 0, 0};
        int[] kod2 = {0, 0, 0, 1};
        int[] kod3 = {0, 1, 0, 1};
        Korekcija test1 = new Korekcija(kod1);
        Korekcija test2 = new Korekcija(kod2);
        Korekcija test3 = new Korekcija(kod3);
        int[] testKod1 = {0, 0, 0, 0, 0, 0, 0};
        int[] testKod2 = {1, 0, 1, 0, 1, 0, 1};
        int[] testKod3 = {0, 0, 1, 1, 0, 0, 1};
        test1.konstruisi();
        test2.konstruisi();
        test3.konstruisi();
        Assert.assertArrayEquals(testKod1, test1.code);
        Assert.assertArrayEquals(testKod2, test2.code);
        Assert.assertArrayEquals(testKod3, test3.code);
    }
    
}
