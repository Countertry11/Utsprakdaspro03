import java.util.Scanner;

public class soal1_03 {
    public static void main(String[] args) {
        final int P = 3;
        Scanner sc = new Scanner(System.in);

        System.out.print("Jenis kertas (1:A4, 2:F4, 3:A3): ");
        int kode = sc.nextInt();

        System.out.print("Cetak warna (true/false): ");
        boolean warna = sc.nextBoolean();

        System.out.print("Jumlah lembar: ");
        int lembar = sc.nextInt();

        String kertas = "";
        int hargaHitam = 0;
        int hargaWarna = 0;

        switch (kode) {
            case 1:
                kertas = "A4";
                hargaHitam = 300;
                hargaWarna = 1000;
                break;
            case 2:
                kertas = "F4";
                hargaHitam = 350;
                hargaWarna = 1200;
                break;
            case 3:
                kertas = "A3";
                hargaHitam = 800;
                hargaWarna = 2500;
                break;
            default:
                System.out.println("Kode kertas tidak tersedia.");
                sc.close();
                return;
        }

        if (lembar < 1 || lembar > 1000) {
            System.out.println("Jumlah lembar tidak valid.");
            sc.close();
            return;
        }

        int hargaDasar = warna ? hargaWarna : hargaHitam;
        int hargaPerLembar = hargaDasar + (P * 10);

        int subtotal = hargaPerLembar * lembar;

        double diskonPersen = 0.0;
        if (lembar >= 500) {
            diskonPersen = 0.15; 
        } else if (lembar >= 100) {
            diskonPersen = 0.10;
        } else {
            diskonPersen = 0.0; 
        }

        double jumlahDiskon = subtotal * diskonPersen;
        double totalSetelahDiskon = subtotal - jumlahDiskon;

        double totalBayar = totalSetelahDiskon < 5000 ? 5000 : totalSetelahDiskon;

        String jenisCetakStr = warna ? "Warna" : "Hitam-putih";
        int diskonInt = (int) (diskonPersen * 100);

        System.out.println("\nKertas          : " + kertas);
        System.out.println("Jenis cetak     : " + jenisCetakStr);
        System.out.println("Harga per lembar : Rp" + hargaPerLembar);
        System.out.println("Subtotal        : Rp" + subtotal);
        System.out.println("Diskon (" + diskonInt + "%)    : Rp" + (int) jumlahDiskon);
        System.out.println("Total bayar     : Rp" + (int) totalBayar);

        sc.close();
    }
}