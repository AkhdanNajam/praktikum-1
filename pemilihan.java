import java.util.Scanner;
public class pemilihan { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nilai tugas (0-100): ");

        int nilaiTugas = sc.nextInt();
        System.out.print("masukkan nilai kuis (0-100): ");
        int nilaiKuis = sc.nextInt();
        System.out.print("masukkan nilai UTS (0-100): ");
        int nilaiUTS = sc.nextInt();
        System.out.print("masukkan nilai UAS (0-100): ");
        int nilaiUAS = sc.nextInt();
        if(nilaiTugas < 0 || nilaiTugas > 100 ||
           nilaiKuis < 0 || nilaiKuis > 100 ||
           nilaiUTS < 0 || nilaiUTS > 100 ||
           nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai tidak valid");
            sc.close();
            return;
        }
        double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);
        System.out.println("Nilai akhir: " + nilaiAkhir);

 String predikat;
if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
    predikat = "A";
} else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
    predikat = "B+";
} else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
    predikat = "B";
} else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
    predikat = "C+";
} else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
    predikat = "C";
} else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
    predikat = "D";
} else if (nilaiAkhir >= 0) {
    predikat = "E";
} else {
    predikat = "Tidak Valid";
}

System.out.println("Predikat: " + predikat);


        System.out.println("Status: " + nilaiAkhir);
        String status = "TIDAK LULUS";
        if (predikat.equals("A") || predikat.equals("B+") || predikat.equals("B") || predikat.equals("C+")) {
            status = "LULUS";
        }
        System.out.println("Status: " + status);
        sc.close();
    }
}
