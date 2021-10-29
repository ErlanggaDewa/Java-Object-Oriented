package com.soal2;

public class Mobil {
    String merk, tahunKeluaran;
    double harga;
    int stok;

    public Mobil(String merk, double harga, String tahunKeluaran, int stok) {
        this.merk = merk;
        this.tahunKeluaran = tahunKeluaran;
        this.harga = harga;
        this.stok = stok;
    }

    public String getMerk() {
        return merk;
    }

    public String getTahunKeluaran() {
        return tahunKeluaran;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void displayInfo() {
        System.out.println("\nInformasi Mobil");
        System.out.println("Merek : " + merk);
        System.out.printf("Harga : %.1f\n", harga);
        System.out.println("Tahun Keluaran : " + tahunKeluaran);
        System.out.println("Sisa Stok : " + stok);
    }
}
