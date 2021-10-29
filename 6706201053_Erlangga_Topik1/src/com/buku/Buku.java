package com.buku;

public class Buku {

    String judul;
    String pengarang;
    Double harga;


    public Buku(String judul, String pengarang, Double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public Double getHarga() {
        return this.harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "judul='" + getJudul() + '\'' +
                ", pengarang='" + getPengarang() + '\'' +
                ", harga=" + getHarga() +
                '}';
    }

}
