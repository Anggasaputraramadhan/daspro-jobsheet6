import java.util.Scanner;

public class Pemilihan2Percobaan305 {

    public static void main(String[] args) {
        Scanner sc05 = new
        Scanner(System.in);
        
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukan kategori : ");
        kategori = sc05.nextLine();
        System.out.print("Masukan besarnya Penghasilan : ");
        penghasilan = sc05.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        } else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;

            }
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasilan Bersih : " + gajiBersih);

        } else
            System.out.println("Masukan Kategori Salah");
    }
}