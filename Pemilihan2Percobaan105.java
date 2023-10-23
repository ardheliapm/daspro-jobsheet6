import java.util.Scanner;

/**
 * Pemilihan2Percobaan105
 */
public class Pemilihan2Percobaan105 {

    public static void main(String[] args) {
        Scanner Absen  = new Scanner(System.in);

        System.out.print("Masukkan Tahun :");
        int Tahun = Absen.nextInt();
            if ((Tahun % 4) == 0 && ((Tahun % 100) != 0 && ((Tahun % 400) == 0 ))) {
                //if ((Tahun % 100) != 0 && ((Tahun % 400) != 0 ))
                System.out.println("Tahun Kabisat");
            } else 
                System.out.println("Bukan Tahun Kabisat");


    }
}