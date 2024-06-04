import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.example.kalkulator.Kalkulator;

public class KalkulatorTest {

    private Kalkulator kalkulator;

    @Before
    public void setUp() {
        kalkulator = new Kalkulator();
    }

    @Test
    public void testReset() {
        kalkulator.tambah(10);
        kalkulator.kurang(5);
        kalkulator.kali(2);
        kalkulator.reset();
        assertEquals(0, kalkulator.dapatkanHasil());
    }

    @Test
    public void testTambah() {
        kalkulator.tambah(10);
        assertEquals(10, kalkulator.dapatkanHasil());
    }

    @Test
    public void testKurang() {
        kalkulator.kurang(5);
        assertEquals(-5, kalkulator.dapatkanHasil());
    }
}
