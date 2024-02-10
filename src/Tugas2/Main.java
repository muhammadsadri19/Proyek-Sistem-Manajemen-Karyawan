package Tugas2;

import java.util.Scanner;

/*Tugas 2: Jadwal Kerja
Gunakan operator untuk menentukan jam kerja karyawan berdasarkan posisi mereka.
tampilkan jam kerja yang telah dihitung.

Asumsi :
CEO     => 7 - 12 = 5 jam
Manager => 8 - 15 = 7 jam
Magang  => 9 - 17 = 8 jam
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isNext;
        do {
            isNext = true;
            System.out.println("======List Posisi Perusahaan======");
            System.out.println("1. CEO");
            System.out.println("2. Manager");
            System.out.println("3. Karyawan");
            System.out.println("4. Magang");
            System.out.println("5. Exit");
            System.out.print("Pilih posisi : ");
            int posisi = sc.nextInt();
            int jamKerja = 0;
            switch (posisi){
                case 1 :
                    jamKerja = 5;
                    System.out.println("Jam kerja untuk posisi CEO : " + jamKerja + " jam");
                    break;
                case 2 :
                    jamKerja = 7;
                    System.out.println("Jam kerja untuk posisi Manager : " + jamKerja + " jam");
                    break;
                case  3:
                    jamKerja = 8 ;
                    System.out.println("Jam kerja untuk posisi Karyawan : " + jamKerja + " jam");
                    break;
                case 4 :
                    jamKerja = 12;
                    System.out.println("Jam kerja untuk posisi Magang : " + jamKerja + " jam");
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Anda harus pilih opsi 1 - 5");
                    isNext = false;


            }
        }while (isNext);

    }
}
