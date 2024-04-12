package uts_soal1;

import java.util.Random;

public class UTS_Soal1 {

    public static void main(String[] args) {
        // Membuat objek dari kelas Random
        Random acak = new Random();

        // Menghasilkan bilangan bulat acak antara 1 dan 12
        int nomorBulan = acak.nextInt(12) + 1;

        // Menampilkan nomor bulan dan nama bulan yang sesuai
        switch (nomorBulan) {
            case 1:
                System.out.println("1 - Januari");
                break;
            case 2:
                System.out.println("2 - Februari");
                break;
            case 3:
                System.out.println("3 - Maret");
                break;
            case 4:
                System.out.println("4 - April");
                break;
            case 5:
                System.out.println("5 - Mei");
                break;
            case 6:
                System.out.println("6 - Juni");
                break;
            case 7:
                System.out.println("7 - Juli");
                break;
            case 8:
                System.out.println("8 - Agustus");
                break;
            case 9:
                System.out.println("9 - September");
                break;
            case 10:
                System.out.println("10 - Oktober");
                break;
            case 11:
                System.out.println("11 - November");
                break;
            case 12:
                System.out.println("12 - Desember");
                break;
            default:
                System.out.println("Nomor bulan tidak valid!");
        }
    }
}