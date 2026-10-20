import java.util.Scanner;

public class soalyudisium_03 {
    public static void main(String[] args) {
        final int P = 3;
        Scanner sc = new Scanner(System.in);

        int minSKS = (P % 2 != 0) ? 144 : 108;
        int batasSemesterPujian = (P % 2 != 0) ? 8 : 6;

        String pesan = "";

        System.out.print("Bebas Kompen (ya/tidak): ");
        String kompenInput = sc.nextLine().trim();
        boolean bebasKompen = kompenInput.equalsIgnoreCase("ya");

        System.out.print("Tanggungan Perpus (true/false): ");
        boolean tanggunganPerpus = sc.nextBoolean();

        if (bebasKompen && !tanggunganPerpus) {
            
            System.out.print("Jumlah SKS lulus: ");
            int sks = sc.nextInt();

            System.out.print("IPK: ");
            double ipk = Double.parseDouble(sc.next().replace(',', '.'));

            if (sks >= minSKS && ipk >= 2.00) {
                
                System.out.print("Lama studi (semester): ");
                int semester = sc.nextInt();

                System.out.print("Pernah mengulang (true/false): ");
                boolean mengulang = sc.nextBoolean();

                String predikat = "";

                if (ipk > 3.50 && semester <= batasSemesterPujian && !mengulang) {
                    predikat = "Dengan Pujian";
                } else if (ipk > 3.00) {
                    predikat = "Sangat Memuaskan";
                } else if (ipk >= 2.76) {
                    predikat = "Memuaskan";
                } else {
                    predikat = "Cukup";
                }

                pesan = "Lulus yudisium dengan predikat " + predikat;

            } else {
                pesan = "Ditolak: syarat akademik (SKS/IPK) belum terpenuhi";
            }

        } else {
            pesan = "Ditolak: syarat administrasi (kompen/perpustakaan) belum terpenuhi";
        }

        System.out.println(pesan);
        sc.close();
    }
}