package com.bagian1;

public class Buku {
    private final String isbn;
    private float rating;
    private float harga;
    private int tahunTerbit;
    private String judulBuku;
    private String pengarang;

    public Buku(String isbn, String judulBuku, String pengarang, int tahunTerbit, float harga, float rating) {
        this.isbn = isbn;

        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getJudulBuku() {
        return this.judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public float getHarga() {
        return this.harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }


    public float getRating() {
        return this.rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }


}
