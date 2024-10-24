import java.util.Scanner;

public class Pemilihan2Percobaan105 {
    public static void main(String[] args){
        Scanner sc05 = new Scanner(System.in);
        int tahun;
        System.out.println("Masukan Tahun");
        tahun = sc05.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("tahun kabisat");
             } else if ((tahun % 400) == 0) {
                System.out.println("tahun kabisat");
             } else
                System.out.println("bukan tahun kabisat");
        } else
            System.out.println("Bukan Tahun Kabisat");

    }

}
