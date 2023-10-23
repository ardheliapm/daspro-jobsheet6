import java.util.Scanner;

public class Pemilihan2Percobaan205 {
    public static void main(String[] args) {
        float sudut1, sudut2, sudut3,totalSudut;

        Scanner Absen = new Scanner (System.in);
        System.out.print("Masukkan Besar Sudut Pertama :");
        sudut1 = Absen.nextFloat();
        System.out.print("Masukkan Sudut Kedua : ");
        sudut2 = Absen.nextFloat();
        System.out.print("Masukkan Sudut Ketiga : ");
        sudut3 = Absen.nextFloat();

        totalSudut = sudut1 + sudut2 + sudut3;
    if (totalSudut == 180) {
        if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
            System.out.println("Segitiga Tersebut Merupakan Segitiga siku-siku");
        } else if (((sudut1 == 60 && sudut2 == 60 && sudut3 == 60) ||  
        (sudut1 == sudut2 || sudut2 == sudut3 || sudut1 == sudut3) || 
        (sudut1 != sudut2 && sudut2 != sudut3 && sudut1 != sudut3))) {
            System.out.println("Segitiga Tersebut merupakan segitiga jenis Lain");
        } else {
            System.out.println("Segitiga tersebut nukan merupakan segitiga siku-siku");
        } 
    } else {
        System.out.println("Bukan segitiga");
    } 

    }
}
       
       
       
       
       
       