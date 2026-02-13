import java.util.Scanner;

public class tugas1platnomor {

    public static void main(String[] args) {

        char[] KODE = {'A','B','D','E','F','G','H','L','N','T'};

        String[] KOTA = {
                "BANTEN",
                "JAKARTA",
                "BANDUNG",
                "CIREBON",
                "BOGOR",
                "PEKALONGAN",
                "SEMARANG",
                "SURABAYA",
                "MALANG",
                "TEGAL"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor: ");
        char input = sc.next().toUpperCase().charAt(0);

        boolean ditemukan = false;

        for (int i = 0; i < KODE.length; i++) {
            if (input == KODE[i]) {
                System.out.println("Kota untuk kode plat " + input + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }

        sc.close();
    }
}
