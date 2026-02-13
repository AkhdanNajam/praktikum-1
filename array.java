import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG IP SEMESTER ===");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = sc.nextInt();
        sc.nextLine();

        String[] namaMK = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] nilaiSetara = new double[jumlahMK];

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMK; i++) {

            System.out.println("\nData Mata Kuliah ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            namaMK[i] = sc.nextLine();

            System.out.print("Bobot SKS        : ");
            sks[i] = sc.nextInt();

            System.out.print("Nilai Angka      : ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();

            if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ipSemester = totalBobot / totalSKS;

        System.out.println("\n===== HASIL KONVERSI NILAI =====");
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println(namaMK[i] +
                    " | SKS: " + sks[i] +
                    " | Nilai Angka: " + nilaiAngka[i] +
                    " | Huruf: " + nilaiHuruf[i] +
                    " | Setara: " + nilaiSetara[i]);
        }

        System.out.println("---------------------------------");
        System.out.println("Total SKS : " + totalSKS);
        System.out.printf("IP Semester : %.2f\n", ipSemester);

        sc.close();
    }
}
