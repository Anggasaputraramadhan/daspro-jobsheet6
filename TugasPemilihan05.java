import java.util.Scanner;

public class TugasPemilihan05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int hargaBuku = 20000;
        double diskon = 0;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc05.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc05.nextInt();
        sc05.nextLine();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon += 0.02;
            } else if (jumlahBuku <= 3) {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        int totalHargaSebelumDiskon = hargaBuku * jumlahBuku;
        double totalDiskon = totalHargaSebelumDiskon * diskon;
        double totalHargaBayar = totalHargaSebelumDiskon - totalDiskon;

        System.out.println("Total diskon: Rp " + (int) totalDiskon);
        System.out.println("Total harga yang harus dibayar: Rp " + (int) totalHargaBayar);
    
    }
}