
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nama : Firman Ardhiansyah 
 *         Kelas : IF-2 (PB02) 
 *         NIM : 10117056
 * Deskripsi : Program ini berisi Program untuk menampilkan Perbandingan dua
 * buah nilai
 */
public class PB0210117056Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka1, angka2;
        String action;

        angka1 = 0;
        angka2 = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("========Program Perbandingan Nilai========");

        do {
            System.out.print("Masukkan nilai pertama : ");
            angka1 = scn.nextInt();
            System.out.print("Masukkan nilai kedua : ");
            angka2 = scn.nextInt();

            if (angka1 > angka2) {
                System.out.println("Hasil : " + angka1 + " Lebih besar dari " + angka2 + "\n");
            } else if (angka1 < angka2) {
                System.out.println("Hasil : " + angka1 + " Lebih kecil dari " + angka2 + "\n");
            } else {
                System.out.println("Hasil : " + angka1 + " sama dengan " + angka2 + "\n");
            }

            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            action = scn.next();

            System.out.println("");
        } while (!action.equals("Tidak"));
    }

}
