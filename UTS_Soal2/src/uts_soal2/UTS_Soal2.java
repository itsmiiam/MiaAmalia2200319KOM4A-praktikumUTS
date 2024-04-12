package uts_soal2;

import java.util.Scanner;

public class UTS_Soal2 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        int jumlahPositif = 0;
        int jumlahNegatif = 0;
        double total = 0;
        int bilangan;
        int jumlahBilangan = 0;

        System.out.println("Masukkan bilangan integer, program akan berhenti jika memasukkan nilai 0:");

        // melakukan perulangan untuk membaca bilangan hingga bertemu 0
        do {
            bilangan = scanner.nextInt();
            if (bilangan != 0) {
                total += bilangan;
                jumlahBilangan++;

                // Memeriksa apakah bilangan positif atau negatif
                if (bilangan > 0) {
                    jumlahPositif++;
                } else if (bilangan < 0) {
                    jumlahNegatif++;
                }
            }
        } while (bilangan != 0);

        // Menghitung rata-rata
        double rataRata = 0;
        if (jumlahBilangan > 0) {
            rataRata = total / jumlahBilangan;
        }

        // Menampilkan keluaran
        System.out.println("Jumlah bilangan positif adalah " + jumlahPositif);
        System.out.println("Jumlah bilangan negatif adalah " + jumlahNegatif);
        System.out.println("Nilai total adalah " + total);
        System.out.println("Nilai rata-rata adalah " + rataRata);
    }
}