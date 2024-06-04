import com.example.kalkulator.Kalkulator;

public class Driver {

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Hasil awal: " + kalkulator.dapatkanHasil());

        kalkulator.tambah(9); 

        System.out.println("Hasil setelah ditambah 9: " + kalkulator.dapatkanHasil());

        kalkulator.kali(2);

        System.out.println("Hasil b setelah dikalikan 2: " + kalkulator.dapatkanHasil());

    }
}
