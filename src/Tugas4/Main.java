package Tugas4;

import java.util.Scanner;

/*Tugas 4: Hari dalam Seminggu
Deklarasikan sebuah variabel untuk mewakili hari saat ini dalam seminggu.
Gunakan pernyataan switch case untuk menampilkan pesan tentang tugas yang direncanakan untuk hari itu.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hari;
        System.out.print("Masukkan nama hari : ");
        hari = sc.next();

        System.out.println("======= Tugas Harian Karyawan ======");
        switch (hari.toLowerCase()){
            case "senin":
                System.out.println("Tugas hari ini : Memikirkan Ide proyek");
                break;
            case "selasa":
                System.out.println("Tugas hari ini : Membuat plan dari Ide kemaren");
                break;
            case "rabu" :
                System.out.println("Tugas hari ini: Mengeksekusi plan yang sudah dibuat");
                break;
            case "kamis":
                System.out.println("Tugas hari ini: Melihat hasil eksekusi proyek");
                break;
            case "jumat":
                System.out.println("Tugas hari ini: Evaluasi Proyek");
                break;
            case "sabtu":
                System.out.println("Hari ini tidak ada tugas, Happy Weekend!");
                break;
            case "minggu":
                System.out.println("Hari ini tidak ada tugas, Nikmati liburan mu!");
                break;
        }
    }
}
