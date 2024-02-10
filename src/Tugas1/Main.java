package Tugas1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/*Tugas 1: Informasi Karyawan
Buat variabel untuk menyimpan information mengenai seorang pegawai (misalnya, nama, jabatan, usia, dan apakah mereka sedang cuti).
tampilkan informasi karyawan.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, jabatan, cuti;
        int usia;

        ArrayList<Object> karyawan = new ArrayList<>();

        System.out.print("Masukkan nama : ");
        name = sc.next();
        karyawan.add(name);

        System.out.print("Masukkan jabatan : ");
        jabatan = sc.next();
        karyawan.add(jabatan);

        System.out.print("Masukkan usia : ");
        usia = sc.nextInt();
        karyawan.add(usia);

        System.out.println("Apakah sedang cuti ? iya/tidak");
        cuti = sc.next();
        switch (cuti){
            case "iya" :
                karyawan.add("Sedang Cuti!");
                break;
            case "tidak" :
                karyawan.add("Tidak Sedang Cuti!");
                break;
        }
        System.out.println("======System Menampilkan Data=======");
        for (Object obj : karyawan){
            System.out.println(obj);
        }
    }
}
