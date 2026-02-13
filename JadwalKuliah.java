import java.util.Scanner;

public class JadwalKuliah {

   
    public static void inputData(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nData Jadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();

            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();

            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();

            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }
    public static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        System.out.println("---------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-15s\n", 
                          "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-20s %-10s %-10s %-15s\n",
                    jadwal[i][0],
                    jadwal[i][1],
                    jadwal[i][2],
                    jadwal[i][3]);
        }
    }

    public static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal pada hari " + hari + ":");
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " +
                                   jadwal[i][1] + " | " +
                                   jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    public static void cariMataKuliah(String[][] jadwal, int n, String namaMK) {
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(namaMK)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Ruang : " + jadwal[i][1]);
                System.out.println("Hari  : " + jadwal[i][2]);
                System.out.println("Jam   : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[][] jadwal = new String[n][4];

        inputData(jadwal, n, sc);
        tampilSemua(jadwal, n);

        System.out.print("\nMasukkan hari yang ingin dicari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String mk = sc.nextLine();
        cariMataKuliah(jadwal, n, mk);

        sc.close();
    }
}
