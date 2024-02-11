package Tugas3;

import java.util.Scanner;

/*Tugas 3: Manajemen Cuti
Menerapkan pernyataan if/else untuk memeriksa apakah karyawan sedang cuti.
tampilkan pesan yang menunjukkan apakah karyawan tersebut sedang cuti.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int cuti;
        System.out.println("Masukkan nama karyawan : ");
        name = sc.next();
        System.out.println("====== Status Karyawan ======\nStatus Cuti\n" +
                "1. Sedang Cuti\n" +
                "2. Sedang Tidak Cuti");

        System.out.print("Pilih opsi 1/2 : ");
        cuti = sc.nextInt();

        if (cuti == 1){
            System.out.println("====== Data Karyawan ======");
            System.out.println("Nama Karyawan   : "+ name);
            System.out.println("Status          : Sedang Cuti");
        }else if (cuti == 2){
            System.out.println("====== Data Karyawan ======");
            System.out.println("Nama Karyawan   : "+ name);
            System.out.println("Status          : Sedang Tidak Cuti");
        }else {
            System.out.println("====== Program Stop ======");
            System.out.println("Karena anda memilih angka selain 1 dan 2 maka program berhenti!\n" +
                    "Jalankan program kembali!");
        }
    }
}
