package uts_soal4;

public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    // Constructor tanpa parameter
    public LimasSegiEmpat() {
        this.luasAlas = 1;
        this.luasSelubungLimas = 1;
        this.tinggi = 1;
    }

    // Constructor dengan parameter
    public LimasSegiEmpat(double luasAlasBaru, double luasSelubungLimasBaru, double tinggiBaru) {
        this.luasAlas = luasAlasBaru;
        this.luasSelubungLimas = luasSelubungLimasBaru;
        this.tinggi = tinggiBaru;
    }

    // Getter untuk luasAlas
    public double getLuasAlas() {
        return luasAlas;
    }

    // Getter untuk luasSelubungLimas
    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    // Getter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Menghitung luas limas segiempat
    public double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    // Menghitung volume limas segiempat
    public double getVolume() {
        return (1.0 / 3) * luasAlas * tinggi;
    }

    // Setter untuk luasAlas
    public void setLuasAlas(double luasAlasBaru) {
        this.luasAlas = luasAlasBaru;
    }

    // Setter untuk luasSelubungLimas
    public void setLuasSelubungLimas(double luasSelubungLimasBaru) {
        this.luasSelubungLimas = luasSelubungLimasBaru;
    }

    // Setter untuk tinggi
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
}
