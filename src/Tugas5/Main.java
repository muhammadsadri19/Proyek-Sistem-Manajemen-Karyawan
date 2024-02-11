package Tugas5;

/*Tugas 5: Warna Proyek
Deklarasikan sebuah array untuk mewakili warna proyek yang digunakan di kantor.
tampilkan setiap warna dalam array tersebut.*/
public class Main {
    public static void main(String[] args) {

        String[] warnaProyek = {"Merah", "Jingga", "Kuning", "Hijau", "Ungu"};
        for (String warna : warnaProyek){
            System.out.println("Warna Proyek : " + warna);
        }
    }
}
