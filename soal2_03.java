import java.util.Scanner;

public class soal2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan = "";

        System.out.print("Bebas Kompen (ya/tidak): ");
        String kompenInput = sc.nextLine().trim();
        boolean bebasKompen = kompenInput.equalsIgnoreCase("ya");

        System.out.print("Tanggungan Perpus (true/false): ");
        boolean tanggunganPerpus = sc.nextBoolean();

        if (bebasKompen && !tanggunganPerpus) {
            pesan = "Lolos: Syarat administrasi terpenuhi";
        } else {
            pesan = "Ditolak: syarat administrasi (kompen/perpustakaan) belum terpenuhi";
        }

        System.out.println(pesan);

        sc.close();
    }
}