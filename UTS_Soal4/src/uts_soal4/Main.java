package uts_soal4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat objek LimasSegiEmpat
        LimasSegiEmpat limas1 = new LimasSegiEmpat(1, 1, 1);
        LimasSegiEmpat limas2 = new LimasSegiEmpat(30, 40, 50);
        LimasSegiEmpat limas3 = new LimasSegiEmpat(25, 35, 45);

        // Menyimpan objek dalam ArrayList
        ArrayList<LimasSegiEmpat> limasList = new ArrayList<>();
        limasList.add(limas1);
        limasList.add(limas2);
        limasList.add(limas3);

        // Menampilkan informasi tentang setiap limas
        for (int i = 0; i < limasList.size(); i++) {
            LimasSegiEmpat limas = limasList.get(i);
            System.out.println("Limas Segi Empat " + "(" + (i+1) + ")" + ":");
            System.out.println("Luas Alas = " + limas.getLuasAlas());
            System.out.println("Luas Selubung Limas = " + limas.getLuasSelubungLimas());
            System.out.println("Tinggi = " + limas.getTinggi());
            System.out.println("Luas = " + limas.getLuas());
            System.out.println("Volume = " + limas.getVolume());
            System.out.println();
        }
    }
}
