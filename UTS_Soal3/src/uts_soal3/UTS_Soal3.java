package uts_soal3;

import java.util.Scanner;

public class UTS_Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int bilangan = scanner.nextInt();
        
        int jumlahDigit = sumDigits(bilangan);
        System.out.println("Jumlah digit dalam bilangan adalah: " + jumlahDigit);
    }

    public static int sumDigits(long n) {
        int total = 0;
        // Menggunakan loop untuk mengekstrak dan menghapus digit berulang kali
        while (n != 0) {
            // Mengambil digit paling kanan
            int digit = (int) (n % 10);
            // Menambahkan digit ke total
            total += digit;
            // Menghapus digit yang telah diekstrak
            n /= 10;
        }
        return total;
    }
}